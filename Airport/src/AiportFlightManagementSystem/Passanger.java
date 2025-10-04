package AiportFlightManagementSystem;

public class Passanger {
  private String passengerID;
  private String name;
  private String seatNumber;
  private Integer boardNumber;
  private boolean boardAtTransit;

  public Passanger (String pID, String name, String seat, 
  Integer boardNum){
    this.passengerID = pID;
    this.name = name;
    this.seatNumber = seat;
    this.boardNumber = boardNum;
    this.boardAtTransit = false;
  }

  public String getPassengerID(){
    return passengerID;
  }

  public String getName(){
    return name;
  }
  public String getSeatNumber(){
    return seatNumber;
  }
  public Integer getBoardNumber(){
    return this.boardNumber;
  }
  public boolean isBoardAtTransit (){
    return this.boardAtTransit;
  }
}
