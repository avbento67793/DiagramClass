package AiportFlightManagementSystem;

import java.sql.Date;


public class Flight {

private String flightNumber;
private String origin;
private String destination;
private Date departureTime;
private String boardingGate;
private String airline;
private Double flightCost;
private Boolean isDirect;

public Flight (String f, String o, String d, Date dP, String bg, String a ,
Double fc, Boolean isD){
this.flightNumber = f;
this.origin = o;
this.destination = d;
this.departureTime = dP;
this.airline = a;
this.flightCost = fc;
this.isDirect = isD;
}

public String getFlightNumber(){
  return this.flightNumber;
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

public String getBoardingGate(){
  return this.boardingGate;
}

public String getAirline(){
  return this.airline;
}

public Double getFlightCost(){
  return this.flightCost;
}

public void setFlightCost(Double price){
  this.flightCost = price;
}

public boolean isDirect(){
  return isDirect;
}

}
