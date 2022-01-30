public class QuestionOne {
  public static void main(String[] args) {
    //Create scanner object to read input
    Scanner in = new Scanner (System.in);
      //Convert celsius to Fahrenheit
      double celsius = in.NextDouble();
      double Fahrenheit = (9.0/5) * celsius +32;
      // Display the information back to the user
      System.out.println(celsius + "in Celsius is " + Fahrenheit + " degrees in Fahrenheit");
