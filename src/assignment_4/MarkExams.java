package assignment_4; 

//2.0
public class MarkExams {

  public static void main(String[] args) {
  //2.1
    //creates object of NumericalQuestion
    NumericalQuestion nqMarkScheme = new NumericalQuestion(198,6);
  //2.2
    //creates object of BooleanQuestion
    BooleanQuestion bqMarkScheme = new BooleanQuestion(true,1);
  //2.3
    //creates object of MultipleChoiceQuestion
    MultipleChoiceQuestion mcpMarkScheme = new MultipleChoiceQuestion(false,false,false,3);
  //2.4
    //creates object of Exam
    Exam markScheme = new Exam(nqMarkScheme, bqMarkScheme, mcpMarkScheme, (nqMarkScheme.getMark() + bqMarkScheme.getMark() + mcpMarkScheme.getMark()));
  //2.5
    //creates another instance of NumericalQuestion
    NumericalQuestion nqAttempt = new NumericalQuestion(196,0);
  //2.6
    //creates another instance of BooleanQuestion
    BooleanQuestion bqAttempt = new BooleanQuestion(true,0);
  //2.7
    //creates another instance of MultipleChoiceQuestion
    MultipleChoiceQuestion mcpAttempt = new MultipleChoiceQuestion(false,false,false,0);
  //2.8
    //creates another instance of Exam
    Exam examAttempt = new Exam(nqAttempt, bqAttempt, mcpAttempt, 0);
  //2.9
    //creates object of Marker and marks the exam attempt using the mark scheme
    Marker marker = new Marker();
    marker.markAttempt(examAttempt, markScheme);
    //prints out the marks awarded out of the total marks available for each question
    System.out.println("Question1: " + nqAttempt.getMark() + " out of " + nqMarkScheme.getMark());
    System.out.println("Question2: " + bqAttempt.getMark() + " out of " + bqMarkScheme.getMark());
    System.out.println("Question3: " + mcpAttempt.getMark() + " out of " + mcpMarkScheme.getMark());
  //2.10
    //prints out the total marks awarded out of the total marks availble for this exam and their classification
    System.out.println("Total marks: " + examAttempt.getTotalMark() + " out of " + markScheme.getTotalMark());
    System.out.println("Classification: " + marker.convertMarksToClassification(9,7,6));

  }

}
