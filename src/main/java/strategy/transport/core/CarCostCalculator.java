package id.ac.ui.cs.advprog.tutorial1.transport.core;


import id.ac.ui.cs.advprog.tutorial1.transport.exceptions.InvalidDistanceException;

public class CarCostCalculator implements TransportCostCalculator {
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
    public Double getTransportTimeInHour(Double distanceInKm) {
        // TODO: implement method
        return distanceInKm / 30;
    }

    @Override
    public Double getTransportFare(Double distanceInKm) {
        // TODO: implement method
        if (distanceInKm <= 2) {
            return 10000.0;
        } else if (distanceInKm > 2) {
            return 10000.0 + (distanceInKm - 2) * 3500;
        }
        return -1.0;
    }

    @Override
    public Integer getTransportSatisfaction(Double distanceInKm) {
        // TODO: implement method
        if (distanceInKm <= 5) {
            return 10;
        } else if (distanceInKm > 5) {
            Integer satisfaction =  10 - (distanceInKm.intValue() / 5);
            if (satisfaction < 1) {
                return 1;
            } else {
                return satisfaction;
            }
        }
        return -1;
    }

    private void assertWithinDistanceLimit(Double distanceInKm){
        // TODO: implement method, throws InvalidDistanceException if requirements are not met
        if (distanceInKm <= 0 || distanceInKm > 50) {
            throw new InvalidDistanceException();
        }
    }
}
