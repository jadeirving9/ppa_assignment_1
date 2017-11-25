package assignment_2;

public class CalorieTracker {

  public static void main(String[] args) {

  //2.1
    //creates new person and sets their calorie intake to a given value
    Person Jade = new Person();

    Dish dish = new Dish();

  //2.2.1
    //person eats the meal with the lowest calories
    Meal HalloumiLunch = new Meal();
    HalloumiLunch.createMeal(dish.TomatoSoup, dish.HalloumiWrap, dish.Baklava);
    Jade.eat(HalloumiLunch.calculateCalories());

  //2.2.2
    //person eats the meal with 1000 calories
    Meal PizzaDinner = new Meal();
    PizzaDinner.createMeal(dish.PotatoWedges, dish.Pizza, dish.Cheesecake);
    Jade.eat(PizzaDinner.calculateCalories());

  //2.2.3
    //person eats the meal with the highest calories
    Meal ChowMeinDinner = new Meal();
    ChowMeinDinner.createMeal(dish.Samosa, dish.ChowMein, dish.Doriyaki);
    Jade.eat(ChowMeinDinner.calculateCalories());

  //3.0
    //person walks to reach the desired calorie intake
    Jade.walk(2000);

  }

}
