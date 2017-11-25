package assignment_2;

//1.1
public class Person {

  private int calories; //field
  private int minutes; //field

  public Person() { //constrcutor
    this.calories = 0;
    System.out.println("Starting calories:" + this.calories);
  }

//1.4
  public void eat(int calories) {
    //adds the calories of the meal to the total calorie count
    this.calories = this.calories + calories;
    //prints total calories in a meal
    System.out.println("Total calories in meal:" + calories);
    //prints person's total calorie intake
    System.out.println("Total calorie intake:" + this.calories);
  }

//1.5
  public void walk(int desiredCalorieIntake) {
    //determines the number of minutes of walking required to reach desired calorie intake
    this.minutes = (this.calories - desiredCalorieIntake);
    //prints out the number of minutes
    System.out.println("Amount of minutes required to reach desired calorie intake:" + this.minutes);
  }

}
