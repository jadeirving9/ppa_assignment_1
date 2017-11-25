package assignment_1;

public class MessagePrinter {

  public static void main(String[] args) { //Main method

    Messages copyOfMessages = new Messages(); //This line creates a copy of the Messages class into a variable

    //These lines access the methods referenced through an object
    copyOfMessages.namePrinter();
    copyOfMessages.wordPrinter();
    copyOfMessages.incrementPrinter(4); //This sets num = 4

  }

}
