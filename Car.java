public class Car{

    private String code;
    private Route fixedRoute;
    private int maxCapacityOfPassengerPerTrip;

    public Car()
    {
        this(null,null,0);
    }

    public Car(String code, Route fixedRoute, int maxCapacityOfPassengerPerTrip)
    {
        this.code = code;
        this.fixedRoute = fixedRoute;
        this.maxCapacityOfPassengerPerTrip = maxCapacityOfPassengerPerTrip;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Route getfixedRoute() {
        return fixedRoute;
    }

    public void setFixedRoute(Route fixedRoute) {
        this.fixedRoute = fixedRoute;
    }

    public int getMaxCapacityOfPassengerPerTrip() {
        return maxCapacityOfPassengerPerTrip;
    }

    public void setMaxCapacityOfPassengerPerTrip(int maxCapacityOfPassengerPerTrip) {
        this.maxCapacityOfPassengerPerTrip = maxCapacityOfPassengerPerTrip;
    }

    public String toString() {
        return "Car{" +
                "code='" + code + '\'' +
                ", fixedRoute=" + fixedRoute +
                ", maxCapacityOfPassengerPerTrip=" + maxCapacityOfPassengerPerTrip +
                "} ";
    }
}
