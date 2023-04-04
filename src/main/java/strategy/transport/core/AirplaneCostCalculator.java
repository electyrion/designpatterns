package id.ac.ui.cs.advprog.tutorial1.transport.core;


import id.ac.ui.cs.advprog.tutorial1.transport.exceptions.InvalidDistanceException;

public class AirplaneCostCalculator implements TransportCostCalculator {
    @Override
    public Cost getCosts(Double distanceInKm) {
        // TODO: implement method

        assertWithinDistanceLimit(distanceInKm);

        Double fare = getTransportFare(distanceInKm);
        Double timeEstimationInHour = getTransportTimeInHour(distanceInKm);
        Integer satisfaction = getTransportSatisfaction(distanceInKm);

        return new Cost(fare, timeEstimationInHour, satisfaction);
    }
    
    @Override
    public Double getTransportFare(Double distanceInKm) {
        // TODO: implement method
        if (distanceInKm <= 300) {
            return 500000.0;
        } else if (distanceInKm > 300) {
            return 500000.0 + ((distanceInKm - 300) / 100) * 150000;
        }
        return -1.0;
    }

    @Override
    public Double getTransportTimeInHour(Double distanceInKm) {
        // TODO: implement method
        return distanceInKm / 800;
    }

    @Override
    public Integer getTransportSatisfaction(Double distanceInKm) {
        // TODO: implement method
        if (distanceInKm < 100) {
            return 10;
        } else {
            Integer satisfaction = 10 - (distanceInKm.intValue() / 100);
            if (satisfaction < 1) {
                return 1;
            } else {
                return satisfaction;
            }
        }
    }
    
    private void assertWithinDistanceLimit(Double distanceInKm){
        // TODO: implement method, throws InvalidDistanceException if requirements are not met

        if (distanceInKm < 300) {
            throw new InvalidDistanceException();
        }
    }
}
