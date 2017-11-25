package assignment_4; 

//1.4
public class Exam {

  //fields
  private NumericalQuestion question1;
  private BooleanQuestion question2;
  private MultipleChoiceQuestion question3;
  private int totalMark;

  //constructor
  public Exam(NumericalQuestion question1, BooleanQuestion question2, MultipleChoiceQuestion question3, int totalMark) {
    this.question1 = question1;
    this.question2 = question2;
    this.question3 = question3;
    this.totalMark = totalMark;
  }
  //gets question 1 answer
  public int Question1Answer() {
    return question1.getAnswer();
  }
  //gets question 1 mark
  public int getQuestion1Mark() {
    return question1.getMark();
  }
  //updates the mark awarded for question 1
  public void updateQuestion1Mark(int mark) {
    question1.updateMark(mark);
  }
  //gets question 2 answer
  public boolean Question2Answer() {
    return question2.getAnswer();
  }
  //gets question 2 mark
  public int getQuestion2Mark() {
    return question2.getMark();
  }
  //updates the mark awarded for question 2
  public void updateQuestion2Mark(int mark) {
    question2.updateMark(mark);
  }
  //gets question 3 option 1
  public boolean Question3Option1() {
    return question3.getOption1();
  }
  //gets question 3 option 2
  public boolean Question3Option2() {
    return question3.getOption2();
  }
  //gets question 3 option 3
  public boolean Question3Option3() {
    return question3.getOption3();
  }
  //gets question 3 mark
  public int getQuestion3Mark() {
    return question3.getMark();
  }
  //updates the mark awarded for question 3
  public void updateQuestion3Mark(int mark) {
    question3.updateMark(mark);
  }
  //updates the total mark awarded for exam attempt
  public void updateTotalMark(int mark) {
    totalMark += mark;
  }
  //returns total mark
  public int getTotalMark() {
    return totalMark;
  }

}
