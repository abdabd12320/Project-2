import java.util.*;
public class Main {
    public static void main(String[] args) {

        ArrayList<Passenger> passengerArrayList = new ArrayList<>();

        Route route1 = new Route("Dammam",700,"Abha");
        Route route2 = new Route("Al-Batha",65,"Al-Malaz");

        Car car = new Car();
        car.setCode("car 0");
        car.setFixedRoute(route2);
        car.setMaxCapacityOfPassengerPerTrip(1);
        Car car1 = new Car("car 1",route1,2);
        Car car2 = new Car("car 2",route2,0);

        SubPassenger subPassenger = new SubPassenger("Ali","a1",car1, route1.getTripPrice());
        NonSubPassenger nonSubPassenger = new NonSubPassenger("Ahmed","b1",car,route2.getTripPrice(),false);
        passengerArrayList.add(subPassenger);
        passengerArrayList.add(nonSubPassenger);

        try {
            for (int i = 0; i < passengerArrayList.size(); i++) {
                passengerArrayList.get(i).takeCraObject(passengerArrayList.get(i).getCar());
                passengerArrayList.get(i).display();
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        nonSubPassenger.setName("Sara");
        nonSubPassenger.setID("c1");
        nonSubPassenger.setCar(car2);
        nonSubPassenger.setTripCost(route2.getTripPrice());

        try {
            for (int i = 0; i < passengerArrayList.size(); i++) {
                passengerArrayList.get(i).takeCraObject(passengerArrayList.get(i).getCar());
                passengerArrayList.get(i).display();
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}