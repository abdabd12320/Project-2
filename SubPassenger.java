public class SubPassenger extends Passenger{

    public SubPassenger()
    {
        this(null,null,null,0.0);
    }

    public SubPassenger(String name, String ID, Car car, double tripCost) {
        super(name, ID, car, tripCost);
    }

    @Override
    public void display()
    {
        System.out.println(getName());
        System.out.println(getID());
        System.out.println(getCar().getCode());
        System.out.println(getCar().getfixedRoute().getStartPickUpAddress());
        System.out.println(getCar().getfixedRoute().getDestinationAddress());
        System.out.println(getCar().getfixedRoute().getTripPrice());
        System.out.println(getTripCost());
        System.out.println();
    }

    @Override
    public double takeCraObject(Car car) throws Exception
    {
        if(car.getMaxCapacityOfPassengerPerTrip() == 0)
        {
            throw new Exception("Maximum capacity of the car is equal 0");
        }
        setTripCost(car.getfixedRoute().getTripPrice() - car.getfixedRoute().getTripPrice()/100*50);
        return getTripCost();
    }

    @Override
    public String toString() {
        return "SubPassenger{} " + super.toString();
    }
}
