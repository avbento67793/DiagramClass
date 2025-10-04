package AiportFlightManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Route {
  private String routeID;
  private String origin;
  private String destination;
  private List<String> transitAirports;
  private Double totalDistance;

  public Route (String route,String origin,String destination,
  Double distance){
    this.routeID = route;
    this.origin = origin;
    this.destination = destination;
    this.transitAirports = new ArrayList<String>();
    this.totalDistance = distance;
  }

  public String getRouteID(){
    return this.routeID;
  }

  public String getOrigin(){
    return this.origin;
  }

  public String getDestination(){
    return this.destination;
  }

  public List<String> getTransitAirports(){
    return this.transitAirports;
  }

  public Double getTotalDistance (){
    return this.totalDistance;
  }
}
