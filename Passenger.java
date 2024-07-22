public abstract class Passenger {

    private String name;
    private String ID;
    private Car car;
    private double tripCost;

    public Passenger() {
        this(null,null,null,0.0);
    }

    public Passenger(String name, String ID, Car car, double tripCost) {
        this.name = name;
        this.ID = ID;
        this.car = car;
        this.tripCost = tripCost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public double getTripCost() {
        return tripCost;
    }

    public void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }

    public abstract double takeCraObject(Car car) throws Exception;

    public abstract void display();

    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", car=" + car +
                ", tripCost=" + tripCost +
                '}';
    }
}
