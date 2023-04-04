package id.ac.ui.cs.advprog.tutorial1.transport.core;


import id.ac.ui.cs.advprog.tutorial1.transport.exceptions.InvalidDistanceException;

public class MotorCostCalculator implements TransportCostCalculator {
    @Override
    public Cost getCosts(Double distanceInKm) {
        //TODO: implement method
        assertWithinDistanceLimit(distanceInKm);

        Double fare = getTransportFare(distanceInKm);
        Double timeEstimationInHour = getTransportTimeInHour(distanceInKm);
        Integer satisfaction = getTransportSatisfaction(distanceInKm);

        return new Cost(fare, timeEstimationInHour, satisfaction);
    }
    
    @Override
    public Double getTransportFare(Double distanceInKm) {
        //TODO: implement method
        if (distanceInKm <= 2) {
            return 5000.0;
        } else if (distanceInKm > 2) {
            return 5000.0 + (distanceInKm - 2) * 1500;
        }
        return -1.0;
    }
    
    @Override
    public Double getTransportTimeInHour(Double distanceInKm) {
        //TODO: implement method
        return distanceInKm / 40;
    }
    
    @Override
    public Integer getTransportSatisfaction(Double distanceInKm) {
        //TODO: implement method
        if (distanceInKm <= 2) {
            return 10;
        } else if (distanceInKm > 2) {
            Integer satisfaction = 10 - (distanceInKm.intValue() / 10) + 1;
            if (satisfaction < 1) {
                return 1;
            } else {
                return satisfaction;
            }
        }
        return -1;
    }
    
    private void assertWithinDistanceLimit(Double distanceInKm){
        //TODO: implement method, throws InvalidDistanceException if requirements are not met
        if (distanceInKm == 0) {
            throw new InvalidDistanceException();
        } else if (distanceInKm < 0) {
            throw new IllegalArgumentException("Distance cannot be negative");
        } else if (distanceInKm > 25) {
            throw new IllegalArgumentException("Distance cannot be more than 25 km, use car instead");
        }
    }
}
