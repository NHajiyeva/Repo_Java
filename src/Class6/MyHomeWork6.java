package Class6;

import java.util.Locale;

public class MyHomeWork6 {
    public static void main(String[] args) {



 char carGear = 'N';                //P,D,N,R
      String driveType = "";

      switch (carGear) {
           case 'P':
               System.out.println ("You can park the car.");
               break;

           case'D':
               switch (driveType.toLowerCase(Locale.ROOT)) {
                   case "snow":
                       System.out.println("You are on Snow mode.");
                       break;
                   case "sport":
                       System.out.println("You are on Sport mode.");
                       break;
                   case "eco":
                       System.out.println("You are on Eco mode.");
               }
               break;

           case 'N':
               System.out.println("Put car in car wash.");
               break;

           case 'R':
               System.out.println("Reverse the car.");
               break;

           default:
               System.out.println ("Invalid gear.");

               }





               

 int num = 5;

        if (num % 3==0 && num % 5==0 == true) {
            System.out.println("Divisible by both");
        }   else  if (num % 3==0) {
          System.out.println("Divisible by 3");
        }   else if (num % 5==0) {
          System.out.println("Divisible by 5");
        }   else {
            System.out.println(num);
        }








  double studentScore = 725;
  double maxScore = 2000;
  double percentage = (studentScore*100)/maxScore;       //((list price - actual price) / (list price)) * 100%


        if  (50.00 >= percentage) {
            System.out.println("Grade F");
        } else if (51.00 <= percentage && percentage <= 60.00) {
            System.out.println("Grade E");
        } else if (61.00 <= percentage && percentage <= 70.00) {
            System.out.println("Grade D");
        } else if (71.00 <= percentage && percentage <= 80.00) {
            System.out.println("Grade C");
        } else if (81.00 <= percentage && percentage <= 90.00) {
            System.out.println("Grade B");
        } else if (91.00 <= percentage && percentage <= 100.00) {
            System.out.println("Grade A");
        }







        }
        }











