package assignment_2;

public class Meal {

  private int starter; //field
  private int main; //field
  private int dessert; //field
  private int dishCalories; //field

  //sets the fields equal to the parameters of the same name
  public void createMeal (int starter, int main, int dessert) {
    this.starter = starter;
    this.main = main;
    this.dessert = dessert;
  }

  //adds and returns the total calories of the meal
  public int calculateCalories() {
    dishCalories = starter + main + dessert;
    return dishCalories;
  }

}
