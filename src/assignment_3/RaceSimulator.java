package assignment_3;

//2.0
public class RaceSimulator {

  public static void main(String[] args) {

    //2.1
      //creates an object of RaceTrack class
      RaceTrack silverstone = new RaceTrack(90, false);

    //2.2
      //creates 3 instances of Car class
      Car Car1 = new Car(1,55,6,5,25,12,15);
      Car Car2 = new Car(2,60,8,7,28,14,10);
      Car Car3 = new Car(3,90,10,6,30,16,9);

    //3.0
      //determines the leaders of laps 1 and 2 and prints the results
      Car1.completeLap(silverstone);
      Car2.completeLap(silverstone);
      Car3.completeLap(silverstone);
      System.out.println("The winner of lap 1 is: " + silverstone.determineRaceLeader(Car1, Car2, Car3));
      Car1.completeLap(silverstone);
      Car2.completeLap(silverstone);
      Car3.completeLap(silverstone);
      System.out.println("The winner of lap 2 is: " + silverstone.determineRaceLeader(Car1, Car2, Car3));

    //4.0
      //makes isRaining = true in the RaceTrack class and determines the winner of the race and prints the result
      silverstone.makeItRain();
      Car1.completeLap(silverstone);
      Car2.completeLap(silverstone);
      Car3.completeLap(silverstone);
      System.out.println("The winner of the race is: " + silverstone.determineRaceWinner(Car1, Car2, Car3));

  }

}
