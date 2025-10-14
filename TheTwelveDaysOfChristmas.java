// Run in PowerShell:
// cd "c:\Users\dbors\OneDrive\Documents\GitHub\assignment-2--fundamentals-of-computing-1--cs-114--fall-2025"
// javac TheTwelveDaysOfChristmas.java
// java TheTwelveDaysOfChristmas

/*rite a program that prints the verses of the song “The Twelve Days of Christmas,” in which each 
verse adds one line. The first two verses of the song are:

    On the 1st day of Christmas my true love gave to me
    A partridge in a pear tree.
    On the 2nd day of Christmas my true love gave to me
    Two turtle doves, and
    A partridge in a pear tree.

Use a `switch` statement in a loop to control which lines get printed. *Hint*: Order the cases 
carefully and avoid the `break` statement. Use a separate `switch` statement to put the
 appropriate suffix on the day number (1st, 2nd, 3rd, etc). The final verse of the song involves
  all 12 days, as follows:

    On the 12th day of Christmas, my true love gave to me
  Twelve drummers drumming,
  Eleven pipers piping,
  Ten lords a-leaping,
  Nine ladies dancing,
  Eight maids a-milking,
  Seven swans a-swimming,
  Six geese a-laying,
  Five golden rings,
  Four calling birds,
  Three French hens,
    Two turtle doves, and
    A partridge in a pear tree.
*/

public class TheTwelveDaysOfChristmas {
  public static void main(String[] args) {
    for (int day = 1; day <= 12; day++) {
      // determine suffix
      String suffix;
      switch (day) {
        case 1:  suffix = "1st"; break;
        case 2:  suffix = "2nd"; break;
        case 3:  suffix = "3rd"; break;
        default: suffix = day + "th"; break;
      }

      // header line
      System.out.println("On the " + suffix + " day of Christmas my true love gave to me");

      // gifts -- cases ordered from 12 down to 1 so fall-through prints accumulated gifts
      switch (day) {
        case 12: System.out.println("Twelve drummers drumming,");
        case 11: System.out.println("Eleven pipers piping,");
        case 10: System.out.println("Ten lords a-leaping,");
        case 9:  System.out.println("Nine ladies dancing,");
        case 8:  System.out.println("Eight maids a-milking,");
        case 7:  System.out.println("Seven swans a-swimming,");
        case 6:  System.out.println("Six geese a-laying,");
        case 5:  System.out.println("Five golden rings,");
        case 4:  System.out.println("Four calling birds,");
        case 3:  System.out.println("Three French hens,");
        case 2:  System.out.println("Two turtle doves, and");
        case 1:  System.out.println("A partridge in a pear tree.");
      }

      // blank line between verses
      if (day < 12) System.out.println();
    }
  }
}
