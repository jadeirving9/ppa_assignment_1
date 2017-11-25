package assignment_3;

//1.1
public class RaceTrack {

  //fields
  private int averageLapTime;
  private boolean isRaining;

  //constructor method sets values given as parameters equal to fields of same name
  public RaceTrack(int averageLapTime, boolean isRaining) {
    this.averageLapTime = averageLapTime;
    this.isRaining = isRaining;
  }

  //sets isRaining = true
  public void makeItRain() {
    isRaining = true;
  }

  //returns averageLapTime
  public int getAverageLapTime() {
    return averageLapTime;
  }

  //returns isRaining
  public boolean getIsRaining() {
    return isRaining;
  }

//1.3
  //determines lap leader from lap times for each car and returns their ID
  public int determineRaceLeader(Car Car1, Car Car2, Car Car3) {
    if ((Car1.getLapTime() < Car2.getLapTime()) && (Car1.getLapTime() < Car3.getLapTime())) {
      return Car1.getID();
    } else if ((Car2.getLapTime() < Car1.getLapTime() && (Car2.getLapTime() < Car3.getLapTime()))) {
      return Car2.getID();
    } else {
      return Car3.getID();
    }
  }

  //determines winner of the race from total race times for each car and returns their ID
  public int determineRaceWinner(Car Car1, Car Car2, Car Car3) {
    if ((Car1.getTotalTime() < Car2.getTotalTime()) && (Car1.getTotalTime() < Car3.getTotalTime())) {
      return Car1.getID();
    } else if ((Car2.getTotalTime() < Car1.getTotalTime()) && (Car2.getTotalTime() < Car3.getTotalTime())) {
      return Car2.getID();
    } else {
      return Car3.getID();
    }
  }

}
