package assignment_4; 

//1.3
public class MultipleChoiceQuestion {

  //fields
  private boolean option1;
  private boolean option2;
  private boolean option3;
  private int mark;

  //constructor
  public MultipleChoiceQuestion(boolean option1, boolean option2, boolean option3, int mark) {
    this.option1 = option1;
    this.option2 = option2;
    this.option3 = option3;
    this.mark = mark;
  }
  //returns option 1
  public boolean getOption1() {
    return option1;
  }
  //returns option 2
  public boolean getOption2() {
    return option2;
  }
  //returns option 3
  public boolean getOption3() {
    return option3;
  }
  //updates mark
  public void updateMark(int mark) {
    this.mark += mark;
  }
  //returns mark
  public int getMark() {
    return mark;
  }

}
