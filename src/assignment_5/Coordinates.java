package assignment_5;

//1.1
public class Coordinates {
  //fields
  private int x;
  private int y;
  //constructor
  public Coordinates(int x, int y) {
    this.x = x;
    this.y = y;
  }
  //updates x coordinate
  public void updateX(int x) {
    this.x = x;
  }
  //updates y coordinate
  public void updateY(int y) {
    this.y = y;
  }
  //returns x coordinate
  public int X() {
    return x;
  }
  //returns y coordinate
  public int Y() {
    return y;
  }

}
