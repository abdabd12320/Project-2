public class NonSubPassenger extends Passenger{

    private boolean discountCoupon;

    public NonSubPassenger() {
        this(null,null,null,0.0,false);
    }

    public NonSubPassenger(String name, String ID, Car car, double tripCost, boolean discountCoupon)
    {
        super(name, ID, car, tripCost);
        this.discountCoupon = discountCoupon;
    }

    public boolean isDiscountCoupon() {
        return discountCoupon;
    }

    public void setDiscountCoupon(boolean discountCoupon) {
        this.discountCoupon = discountCoupon;
    }

    @Override
    public void display() {
        System.out.println(getName());
        System.out.println(getID());
        System.out.println(getCar().getCode());
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

        if(!isDiscountCoupon())
        {
           setTripCost(car.getfixedRoute().getTripPrice() - car.getfixedRoute().getTripPrice()/100*10);
           setDiscountCoupon(true);
           return getTripCost();
        }
        return 0;
    }

    @Override
    public String toString() {
        return "NonSubPassenger{" +
                "discountCoupon=" + discountCoupon +
                "} " + super.toString();
    }
}
