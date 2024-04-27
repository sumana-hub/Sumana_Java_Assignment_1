/*5.29 (“The Twelve Days of Christmas” Song) 
Write an application that uses iteration and switchstatements 
to print the song “The Twelve Days of Christmas.” One switch 
statement should be used to print the day (“first,” “second,” 
and so on). A separate switch statement should be used to print 
the remainder of each verse.
*/
public class Chap5_ex529 {
  public static void main(String[] args) {
      for (int day = 1; day <= 12; day++) {
          switch (day) {
              case 1:
                  System.out.println("On the first day of Christmas, my true love sent to me:");
                  break;
              case 2:
                  System.out.println("On the second day of Christmas, my true love sent to me:");
                  break;
              case 3:
                  System.out.println("On the third day of Christmas, my true love sent to me:");
                  break;
              case 4:
                  System.out.println("On the fourth day of Christmas, my true love sent to me:");
                  break;
              case 5:
                  System.out.println("On the fifth day of Christmas, my true love sent to me:");
                  break;
              case 6:
                  System.out.println("On the sixth day of Christmas, my true love sent to me:");
                  break;
              case 7:
                  System.out.println("On the seventh day of Christmas, my true love sent to me:");
                  break;
              case 8:
                  System.out.println("On the eighth day of Christmas, my true love sent to me:");
                  break;
              case 9:
                  System.out.println("On the ninth day of Christmas, my true love sent to me:");
                  break;
              case 10:
                  System.out.println("On the tenth day of Christmas, my true love sent to me:");
                  break;
              case 11:
                  System.out.println("On the eleventh day of Christmas, my true love sent to me:");
                  break;
              case 12:
                  System.out.println("On the twelfth day of Christmas, my true love sent to me:");
                  break;
          }

          for (int verse = day; verse >= 1; verse--) {
              switch (verse) {
                  case 1:
                      System.out.println("A partridge in a pear tree.");
                      break;
                  case 2:
                      System.out.println("Two turtle doves,");
                      break;
                  case 3:
                      System.out.println("Three French hens,");
                      break;
                  case 4:
                      System.out.println("Four calling birds,");
                      break;
                  case 5:
                      System.out.println("Five golden rings,");
                      break;
                  case 6:
                      System.out.println("Six geese a-laying,");
                      break;
                  case 7:
                      System.out.println("Seven swans a-swimming,");
                      break;
                  case 8:
                      System.out.println("Eight maids a-milking,");
                      break;
                  case 9:
                      System.out.println("Nine ladies dancing,");
                      break;
                  case 10:
                      System.out.println("Ten lords a-leaping,");
                      break;
                  case 11:
                      System.out.println("Eleven pipers piping,");
                      break;
                  case 12:
                      System.out.println("Twelve drummers drumming,");
                      break;
              }
          }
          System.out.println();
      }
  }
}
