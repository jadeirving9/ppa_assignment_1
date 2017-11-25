package assignment_5;

//1.3
public class Aeroplane {
  //fields
  private String name;
  private Coordinates coordinates;
  private int speed;
  private int totalDistance;
  private int repairDistance;
  private int repairCount;
  //constructor
  public Aeroplane(String name, Coordinates currentCoordinates, int speed, int totalDistance, int repairDistance) {
    this.name = name;
    this.coordinates = currentCoordinates;
    this.speed = speed;
    this.totalDistance = totalDistance;
    this.repairDistance = repairDistance;
  }
  //1.4
  //adjusts coordinates to reach destination and returns single journey distance
  public int singleFlight(Destination destination) {
    int journeyDistance = 0;
    //1.4.1
    //1.4.2
    while (coordinates.X() != destination.X()) {
      if (coordinates.X() > destination.X()) {
        if (coordinates.X() - destination.X() < speed) {
          coordinates.updateX(coordinates.X() - destination.X());
          journeyDistance += coordinates.X();
        } else {
          coordinates.updateX(coordinates.X() - speed);
          journeyDistance += speed;
        }
      }
      //if (coordinates.X() < destination.X())
      else {
        if (destination.X() - coordinates.X() < speed) {
          coordinates.updateX(destination.X() - coordinates.X());
          journeyDistance += coordinates.X();
        } else {
          coordinates.updateX(coordinates.X() + speed);
          journeyDistance += speed;
        }
      }
    }
    //1.4.3
    while (coordinates.Y() != destination.Y()) {
      if (coordinates.Y() > destination.Y()) {
        if (coordinates.Y() - destination.Y() < speed) {
         coordinates.updateY(coordinates.Y() - destination.Y());
         journeyDistance += coordinates.Y();
        } else {
          coordinates.updateY(coordinates.Y() - speed);
          journeyDistance += speed;
        }
      }
      //(coordinates.Y() < destination.Y())
      else {
        if (destination.Y() - coordinates.Y() < speed) {
          coordinates.updateY(destination.Y() - coordinates.Y());
          journeyDistance += coordinates.Y();
        } else {
          coordinates.updateY(coordinates.Y() + speed);
          journeyDistance += speed;
        }
      }
    }

    totalDistance += journeyDistance;
    return journeyDistance;

  }
  //returns current x coordinate
  public int getCurrentXCoordinate() {
    return coordinates.X();
  }
  //returns current y coordinate
  public int getCurrentYCoordinate() {
    return coordinates.Y();
  }
  //updates total distance
  public void updateTotalDistance(int totalDistance) {
    this.totalDistance = totalDistance;
  }
  //returns total distance
  public int getTotalDistance() {
    return totalDistance;
  }
  //returns name
  public String getName() {
    return name;
  }
  //2.6.2
  //checks to see if repairs are needed
  public boolean repairDistanceCheck() {
    if (repairDistance <= totalDistance) {
      return true;
    } else {
      return false;
    }
  }
  //updates repair count
  public void updateRepairCount(int repairCount) {
    this.repairCount += repairCount;
  }
  //returns repair count
  public int getRepairCount() {
    return repairCount;
  }

}
