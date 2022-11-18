public class FlightManager {

    public double calculateWeightReservedForPassengerBags(Flight flight){
        return flight.getPlane().getPlaneWeightAllowance() / 2;
    }
    public double calculateBagWeightPerPassenger(Flight flight) {
        return calculateWeightReservedForPassengerBags(flight) / flight.getPlane().getPlaneCapacity();
    }

    public double calculateHowMuchBaggageWeightIsBooked(Flight flight) {
        double totalWeight = 0;
        for(Passenger passenger: flight.getPassengers()){
            totalWeight += (passenger.getBags() * calculateBagWeightPerPassenger(flight));
        }
        return totalWeight;
    }

    public double calculateHowMuchBaggageWeightIsLeft(Flight flight) {
        return calculateWeightReservedForPassengerBags(flight) - calculateHowMuchBaggageWeightIsBooked(flight);
    }
}
