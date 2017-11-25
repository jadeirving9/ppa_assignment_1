package assignment_5;

//2.0
public class FlightSimulation {

  public static void main(String[] args) {
    //2.1
    Coordinates Destination1Coordinates = new Coordinates(40,30);
    Destination destination1 = new Destination("London",Destination1Coordinates);
    //2.2
    Coordinates Destination2Coordinates = new Coordinates(90,80);
    Destination destination2 = new Destination("Dubai",Destination2Coordinates);
    //2.3
    Coordinates Destination3Coordinates = new Coordinates(120,100);
    Destination destination3 = new Destination("Male",Destination3Coordinates);
    //2.4
    Coordinates AeroplaneCoordinates = new Coordinates(40,30);
    Aeroplane aeroplane = new Aeroplane("Concorde",AeroplaneCoordinates,5,0,3500);
    //2.6
    for (int day = 1; day < 121; day++) {
      //2.6.1
      System.out.println("Day: " + day);
      System.out.println("Distance travelled: " + aeroplane.getTotalDistance());
      //2.6.2
      if (aeroplane.repairDistanceCheck()) {
        day += 7;
        aeroplane.updateTotalDistance(0);
        aeroplane.updateRepairCount(1);
      } else {
        //2.5.1
        System.out.println(aeroplane.getName());
        System.out.println("Start destination: " + destination1.getName());
        System.out.println("End destination: " + destination2.getName());
        System.out.println("Single journey's distance: " + aeroplane.singleFlight(destination2));
        System.out.println("Total distance travelled: " + aeroplane.getTotalDistance());
        System.out.println("Current location coordinates: " + "(" + aeroplane.getCurrentXCoordinate() + "," + aeroplane.getCurrentYCoordinate() + ")");
        //2.5.2
        System.out.println(aeroplane.getName());
        System.out.println("Start destination: " + destination2.getName());
        System.out.println("End destination: " + destination3.getName());
        System.out.println("Single journey's distance: " + aeroplane.singleFlight(destination3));
        System.out.println("Total distance travelled: " + aeroplane.getTotalDistance());
        System.out.println("Current location coordinates: " + "(" + aeroplane.getCurrentXCoordinate() + "," + aeroplane.getCurrentYCoordinate() + ")");
        //2.5.3
        System.out.println(aeroplane.getName());
        System.out.println("Start destination: " + destination3.getName());
        System.out.println("End destination: " + destination2.getName());
        System.out.println("Single journey's distance: " + aeroplane.singleFlight(destination2));
        System.out.println("Total distance travelled: " + aeroplane.getTotalDistance());
        System.out.println("Current location coordinates: " + "(" + aeroplane.getCurrentXCoordinate() + "," + aeroplane.getCurrentYCoordinate() + ")");
        //2.5.4
        System.out.println(aeroplane.getName());
        System.out.println("Start destination: " + destination2.getName());
        System.out.println("End destination: " + destination1.getName());
        System.out.println("Single journey's distance: " + aeroplane.singleFlight(destination1));
        System.out.println("Total distance travelled: " + aeroplane.getTotalDistance());
        System.out.println("Current location coordinates: " + "(" + aeroplane.getCurrentXCoordinate() + "," + aeroplane.getCurrentYCoordinate() + ")");
        //2.5.2
      }
    }
    //2.6.3
    System.out.println("Repair count: " + aeroplane.getRepairCount());

  }

}
