package assignment_3;

//1.2
public class Car {

  //fields
  private int id;
  private int fuel;
  private int lowFuelBoost;
  private int highFuelSlowdown;
  private int fuelConsumptionPerLap;
  private int pitStopTime;
  private int rainSlowdown;
  private int totalTime;
  private int lapTime;

  //constructor method sets values given as parameters equal to the fields of the same name.
  public Car(int id, int fuel, int lowFuelBoost, int highFuelSlowdown, int fuelConsumptionPerLap, int pitStopTime, int rainSlowdown) {
    this.id = id;
    this.fuel = fuel;
    this.lowFuelBoost = lowFuelBoost;
    this.highFuelSlowdown = highFuelSlowdown;
    this.fuelConsumptionPerLap = fuelConsumptionPerLap;
    this.pitStopTime = pitStopTime;
    this.rainSlowdown = rainSlowdown;
  }

//1.4
  //determines lap time
  public int completeLap(RaceTrack silverstone) {
    //assumes copy of RaceTrack will be made and named silverstone, uses getAverageLapTime method in RaceTrack
    lapTime = silverstone.getAverageLapTime();
    if (fuel <= 100) { //max fuel = 100
      if (fuel > 50) {
        lapTime = lapTime + highFuelSlowdown;
      } else {
        lapTime = lapTime - lowFuelBoost;
      }
    }
    //assumes copy of RaceTrack will be made and named silverstone, uses getIsRaining method in RaceTrack
    if (silverstone.getIsRaining() == true) {
      lapTime = lapTime + rainSlowdown;
    } 
    //makes sure fuel consumption per lap is greater than the current amount of fuel
    if (fuelConsumptionPerLap >= fuel) {
      lapTime = lapTime + pitStopTime;
      fuel = 100;
    } else {
      fuel = fuel - fuelConsumptionPerLap;
    }

    //adds the laptime to the total race time
    totalTime = totalTime + lapTime;
    return lapTime;
  }

  public int getLapTime() {
    return lapTime;
  }

  //returns total race time
  public int getTotalTime() {
    return totalTime;
  }

  //returns car's ID number
  public int getID() {
    return id;
  }

}
