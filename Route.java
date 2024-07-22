public class Route{

    private String startPickUpAddress;
    private String destinationAddress;
    private double tripPrice;

    public Route()
    {
        this(null,0.0,null);
    }

    public Route(String startPickUpAddress, double tripPrice, String destinationAddress)
    {
        this.startPickUpAddress = startPickUpAddress;
        this.tripPrice = tripPrice;
        this.destinationAddress = destinationAddress;
    }

    public String getStartPickUpAddress() {
        return startPickUpAddress;
    }

    public void setStartPickUpAddress(String startPickUpAddress) {
        this.startPickUpAddress = startPickUpAddress;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public double getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(double tripPrice) {
        this.tripPrice = tripPrice;
    }


    public String toString() {
        return "Route{" +
                "startPickUpAddress='" + startPickUpAddress + '\'' +
                ", destinationAddress='" + destinationAddress + '\'' +
                ", tripPrice=" + tripPrice +
                "} ";
    }
}
