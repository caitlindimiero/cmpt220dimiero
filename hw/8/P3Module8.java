import java.time.Duration;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class P3Module8 {

    public static void main(String[] args) {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("US230",
        new GregorianCalendar(2014, 4, 5, 5, 5, 0),
        new GregorianCalendar(2014, 4, 5, 6, 15, 0)));
        flights.add(new Flight("US235",
        new GregorianCalendar(2014, 4, 5, 6, 55, 0),
        new GregorianCalendar(2014, 4, 5, 7, 45, 0)));
        flights.add(new Flight("US237",
        new GregorianCalendar(2014, 4, 5, 9, 35, 0),
        new GregorianCalendar(2014, 4, 5, 12, 55, 0)));
        Itinerary itinerary = new Itinerary(flights);
        System.out.println(itinerary.getTotalTravelTime());
        System.out.println(itinerary.getTotalFlightTime());
    }

}

class Flight { // For the first class
    private String flightNo; // Directions a-e
    private GregorianCalendar departureTime;
    private GregorianCalendar arrivalTime;

    public String getFlightNo() {
        return this.flightNo;
    }

    public GregorianCalendar getDeparture() { 
        return departureTime;
    }

    public void setDeparture(GregorianCalendar departure) {
        this.departureTime = departure;
    }

    public GregorianCalendar getArrival() {
        return arrivalTime;
    }

    public void setArrival(GregorianCalendar arrival) {
        this.arrivalTime = arrival;
    }

    public int getFlightTime() {
        return Duration.between(arrivalTime.toInstant(), departureTime.toInstant()).toMinutesPart();
    }

    Flight(String flightNumber, GregorianCalendar departureTime, GregorianCalendar arrivalTime) {
        this.flightNo = flightNumber;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

}

class Itinerary { // For the second class

    private List<Flight> flights; // Directions a-c

    public int getTotalTravelTime() {
        Flight firstFlight = flights.get(0);
        Flight lastFlight = flights.get(flights.size() -1 );

        return Duration.between(
            firstFlight.getDeparture().toInstant(),
            lastFlight.getArrival().toInstant()
        ).toMinutesPart();
    }

    public int getTotalFlightTime() {
        int totalFlightTime = 0;
        for (Flight flight : flights) {
            totalFlightTime += flight.getFlightTime();
        }
        return totalFlightTime;
    }

    Itinerary(List<Flight> flights) {
        this.flights = flights;
    }

}