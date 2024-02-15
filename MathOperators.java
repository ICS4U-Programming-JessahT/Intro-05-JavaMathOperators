/**
 * Using math operators in java.
 *
 * @author Jessah
 * @version 1.0 @2024-02-15
 */
public final class MathOperators {
  /** Private constructor to prevent instantiation of this utility class. */
  private MathOperators() {
    // whitespace
  }

  /**
   * Print message.
   *
   * @param args Command-line arguments (not used in program).
   */
  public static void main(final String[] args) {
    // print out math equations
    System.out.println("4 + 4 = " + (4 + 4));
    System.out.println("4 - 2 = " + (4 - 2));
    System.out.println("4 * 3 = " + (4 * 3));
    System.out.println("20 / 4 = " + (20 / 4));
    System.out.println("4 / 3 = " + (4.0 / 3.0));
    System.out.println("4^2 = " + (Math.pow(4, 2)));
    System.out.println("3^3 = " + (Math.pow(3, 3)));
    System.out.println("√4 = " + (Math.sqrt(4)));
  }
}
