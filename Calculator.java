
import java.util.Scanner;

public class Calculator {
  
     public static void main(String[] args)
     {
         int selection;
         double number, number2, number3, number4, number5, number6, number7, number8, add, subtract, multiply, divide;
       
         Scanner scanner = new Scanner(System.in);
         
         System.out.println("Select the action you want to do:\n"+
                            "Press 1 to add\n"+
                            "2 to subtract\n"+
                            "3 to multiply\n"+
                            "4 to divide\n"+
                            "0 to exit");
       
         selection = scanner.nextInt();
       
         switch(selection)
         {   
             case 0:
                 break;
             case 1:
                 System.out.print("Number 1:");     number = scanner.nextDouble();
                 System.out.print("Number 2:");     number2 = scanner.nextDouble();
                 add = number + number2;
                 System.out.print("Add: " + add);
                 break;
             case 2:
                 System.out.print("Number 1:");     number3 = scanner.nextDouble();
                 System.out.print("Number 2:");     number4 = scanner.nextDouble();
                 subtract = number3 - number4;
                 System.out.print("Subtract: " + subtract);
                 break;
             case 3:
                 System.out.print("Number 1:");     number5 = scanner.nextDouble();
                 System.out.print("Number 2:");     number6 = scanner.nextDouble();
                 multiply = number5 * number6;
                 System.out.print("Multiply: " + multiply);
                 break;
             case 4:
                 System.out.print("Number 1:");     number7 = scanner.nextDouble();
                 System.out.print("Number 2:");     number8 = scanner.nextDouble();
                 divide = number7 / number8;
                 System.out.print("Divide: " + divide);
                 break;
             default:
                 System.out.println("You made the wrong choice!");
                 break;
         }
     }
  
}
