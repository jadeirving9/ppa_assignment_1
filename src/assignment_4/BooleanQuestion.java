package assignment_4;

//1.2
public class BooleanQuestion {

  //fields
  private boolean answer;
  private int mark;

  //constructor
  public BooleanQuestion(boolean answer, int mark) {
    this.answer = answer;
    this.mark = mark;
  }
  //returns answer
  public boolean getAnswer() {
    return answer;
  }
  //updates mark
  public void updateMark(int mark) {
    this.mark = mark;
  }
  //returns mark
  public int getMark() {
    return mark;
  }

}
