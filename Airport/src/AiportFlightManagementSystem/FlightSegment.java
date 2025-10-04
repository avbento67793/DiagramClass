package AiportFlightManagementSystem;

import java.util.Date;

public class FlightSegment {
private String segmentID;
private String origin;
private String destination;
private Date departureTime;
private Date arrivalTime;
private String airline;
private Aircraft aircraft;

public FlightSegment (String sId, String o, String d, Date dt, Date at,
String a, Aircraft ar){

  this.segmentID = sId;
  this.origin = o;
  this.destination = d;
  this.departureTime = dt;
  this.arrivalTime = at;
  this.airline = a;
  this.aircraft = ar;

}
public String getSegmentID(){
  return this.segmentID ;
}

public String getOrigin(){
  return this.origin;

}
public String getDestination(){
  return this.destination;
}

public Date getDepartureTime(){
  return this.departureTime;

}

public Date getArrivalTime(){
  return this.arrivalTime;
}

public String getAirline(){
  return this.airline;
}

public Aircraft getAircraft(){
  return this.aircraft;
}


}
