package assignment_4; 

//1.1
public class NumericalQuestion {

  //fields
  private int answer;
  private int mark;

  //constructor
  public NumericalQuestion(int answer, int mark) {
    this.answer = answer;
    this.mark = mark;
  }
  //returns answer
  public int getAnswer() {
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
