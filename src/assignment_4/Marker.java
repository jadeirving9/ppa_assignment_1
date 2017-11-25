package assignment_4; 

//1.5
public class Marker {

  //fields
  private int totalMark;
  private double classification;

  //1.5.1
  //adjusts the marks awarded for each question and calculates the total mark for attempt
  public void markAttempt(Exam examAttempt, Exam markScheme) {
    //1.5.2
    if ((examAttempt.Question1Answer()) == (markScheme.Question1Answer())) {
        examAttempt.updateQuestion1Mark(markScheme.getQuestion1Mark());
    } else if (((examAttempt.Question1Answer()) == ((markScheme.Question1Answer()) + 1)) || ((examAttempt.Question1Answer()) == ((markScheme.Question1Answer()) - 1))) {
        examAttempt.updateQuestion1Mark((markScheme.getQuestion1Mark()) - 1);
    } else if (((examAttempt.Question1Answer()) == ((markScheme.Question1Answer()) + 2)) || ((examAttempt.Question1Answer()) == ((markScheme.Question1Answer()) - 2))) {
          examAttempt.updateQuestion1Mark(1);
    } else if (((examAttempt.Question1Answer()) == ((markScheme.Question1Answer()) + 3)) || ((examAttempt.Question1Answer()) == ((markScheme.Question1Answer()) - 3))) {
          examAttempt.updateQuestion1Mark(1);
    } else if (((examAttempt.Question1Answer()) == ((markScheme.Question1Answer()) + 4)) || ((examAttempt.Question1Answer()) == ((markScheme.Question1Answer()) - 4))) {
          examAttempt.updateQuestion1Mark(1);
    } else if (((examAttempt.Question1Answer()) == ((markScheme.Question1Answer()) + 5)) || ((examAttempt.Question1Answer()) == ((markScheme.Question1Answer()) - 5))) {
          examAttempt.updateQuestion1Mark(1);
    } else {
        examAttempt.updateQuestion1Mark(0);
    }

    //1.5.3
    if ((examAttempt.Question2Answer()) == (markScheme.Question2Answer())) {
      examAttempt.updateQuestion2Mark(markScheme.getQuestion2Mark());
    } else {
      examAttempt.updateQuestion2Mark(0);
    }

    //1.5.4
    if ((examAttempt.Question3Option1()) == (markScheme.Question3Option1())) {
      examAttempt.updateQuestion3Mark(1);
    } if ((examAttempt.Question3Option2()) == (markScheme.Question3Option2())) {
      examAttempt.updateQuestion3Mark(1);
    } if ((examAttempt.Question3Option3()) == (markScheme.Question3Option3())) {
      examAttempt.updateQuestion3Mark(1);
    }

    //1.5.5
    totalMark = examAttempt.getQuestion1Mark() + examAttempt.getQuestion2Mark() + examAttempt.getQuestion3Mark();
    examAttempt.updateTotalMark(totalMark);

  }

  //1.6
  //determines classification using the total marks field and given boundaries
  public double convertMarksToClassification(int firstBoundary, int upperSecondBoundary, int lowerSecondBoundary) {
    if (totalMark >= firstBoundary) {
      classification = 1.1;
    } else if (totalMark >= upperSecondBoundary) {
      classification = 2.1;
    } else if (totalMark >= lowerSecondBoundary) {
      classification = 2.2;
    } else {
      classification = 0.0;
    }
    return classification;
  }

  //returns total mark
  public int getTotalMark() {
    return totalMark;
  }

}
