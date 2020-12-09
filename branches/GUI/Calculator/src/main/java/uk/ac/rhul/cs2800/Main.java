package uk.ac.rhul.cs2800;

/**
 * Main.
 * 
 * @author Philip
 *
 */
public class Main {
  
  /**
   * Main method to get instance of view and pass it to the controller.
   * 
   * @param args null
   */
  public static void main(String[] args) {
    ViewInterface view = MyView.getInstance();
    CalcController controller = new CalcController(view);
  }

}
