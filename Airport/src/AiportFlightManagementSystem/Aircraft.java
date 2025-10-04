package AiportFlightManagementSystem;

public class Aircraft {
private String manufacturer;
private String model;
private Integer capacity;
private Boolean availability;

public Aircraft (String manufacturer, String model, Integer capacity){

this.manufacturer = manufacturer;
this.model = model;
this.capacity = capacity;
this.availability = true;

}
public String getManufacturer(){
  return this.manufacturer;
}

public String getModel(){
return this.model;
}

public Integer getCapacity(){
return this.capacity;
}

public Boolean isAvailable(){
  return this.availability;
}

}
