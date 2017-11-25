package assignment_5;

//1.2
public class Destination {
  //fields
  private String name;
  private Coordinates coordinates;
  //constructor
  public Destination(String name, Coordinates destinationCoordinates) {
    this.name = name;
    this.coordinates = destinationCoordinates;
  }
  //returns x coordinate of destination
  public int X() {
    return coordinates.X();
  }
  //returns y coordinate of destination
  public int Y() {
    return coordinates.Y();
  }
  //returns name of destination
  public String getName() {
    return name;
  }

}
