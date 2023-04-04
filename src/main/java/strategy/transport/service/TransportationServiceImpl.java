package id.ac.ui.cs.advprog.tutorial1.transport.service;

import id.ac.ui.cs.advprog.tutorial1.transport.core.*;
import id.ac.ui.cs.advprog.tutorial1.transport.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransportationServiceImpl implements TransportationService{

    final LocationRepository locationRepository;
    TransportCostCalculator transportStrategy;

    @Autowired
    public TransportationServiceImpl(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public Cost calculateCost(String locationName, String transportationTypeName) {
        //TODO: implement method
        // Returns either Cost or null

        Location location = locationRepository.findByName(locationName);
        Cost cost = new Cost(null, null, null);

        if (location == null) {
            return null;
        } else {
            if (transportationTypeName.equals("Airplane")) {
                transportStrategy = new AirplaneCostCalculator();
                cost = transportStrategy.getCosts(location.getDistance());
            } else if (transportationTypeName.equals("Car")) {
                transportStrategy = new CarCostCalculator();
                cost = transportStrategy.getCosts(location.getDistance());
            } else if (transportationTypeName.equals("Motorcycle")) {
                transportStrategy = new MotorCostCalculator();
                cost = transportStrategy.getCosts(location.getDistance());
            }
            return cost;
        }
    }
}
