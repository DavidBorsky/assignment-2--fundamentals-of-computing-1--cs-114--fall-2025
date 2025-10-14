

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
