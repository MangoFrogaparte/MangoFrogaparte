/* JavaCalculatorV2 was made by Devin Byers August 28 at 7:03 pm */
import java.util.Scanner;
import java.lang.Math;
public class JavaCalculatorV2
{
    public static void main(String[] args) {
        int a = 0;
        while (a == 0) {
        System.out.println(" ");
        System.out.println("|0 = Calculations Complete|1 = Addition|2 = Subtraction|3 = Multiplication|4 = Division|5 = Modulus|6 = Square Root|7 = Floor Division|8 = Trigometric Functions|9 = Hyperbolic Functions|");
        System.out.println("Enter Operation: ");
        Scanner operation = new Scanner(System.in);
        long Operation = operation.nextLong();
        /*#####################################*/
        if (Operation == 0)
            {
            System.out.println("Calculations Complete");
            a = 1;
            }
        if (Operation == 1)
           {
            System.out.println("Enter First Number: ");
            Scanner betax = new Scanner(System.in);
            int x = operation.nextInt();
            System.out.println("Enter Second Number: ");
            Scanner betay = new Scanner(System.in);
            int y = operation.nextInt();
            System.out.println("__________________________________________________________________________________________________________");
            System.out.println(x + y);
            }
        if (Operation == 2)
            {
            System.out.println("Enter First Number: ");
            Scanner betax = new Scanner(System.in);
            int x = operation.nextInt();
            System.out.println("Enter Second Number: ");
            Scanner betay = new Scanner(System.in);
            int y = operation.nextInt();
            System.out.println("__________________________________________________________________________________________________________");
            System.out.println(x - y);
            }
        if (Operation == 3)
            {
            System.out.println("Enter First Number: ");
            Scanner betax = new Scanner(System.in);
            int x = operation.nextInt();
            System.out.println("Enter Second Number: ");
            Scanner betay = new Scanner(System.in);
            int y = operation.nextInt();
            System.out.println("__________________________________________________________________________________________________________");
            System.out.println(x * y);
            }
        if (Operation == 4)
            {
            System.out.println("Enter First Number: ");
            Scanner betax = new Scanner(System.in);
            int x = operation.nextInt();
            System.out.println("Enter Second Number: ");
            Scanner betay = new Scanner(System.in);
            int y = operation.nextInt();
            System.out.println("__________________________________________________________________________________________________________");
            System.out.println(x / y);
            }
        if (Operation == 5)
            {
            System.out.println("Enter First Number: ");
            Scanner betax = new Scanner(System.in);
            int x = operation.nextInt();
            System.out.println("Enter Second Number: ");
            Scanner betay = new Scanner(System.in);
            int y = operation.nextInt();
            System.out.println("__________________________________________________________________________________________________________");
            System.out.println(x % y);    
            }
        if (Operation == 6)
            {
            System.out.println("Enter Number: ");
            Scanner betax = new Scanner(System.in);
            int x = operation.nextInt();
            System.out.println("__________________________________________________________________________________________________________");
            System.out.println(Math.sqrt(x));    
            }
        if (Operation == 7)
            {
            System.out.println("Enter First Number: ");
            Scanner betax = new Scanner(System.in);
            int x = operation.nextInt();
            System.out.println("Enter Second Number: ");
            Scanner betay = new Scanner(System.in);
            int y = operation.nextInt();
            System.out.println("__________________________________________________________________________________________________________");
            System.out.println(Math.floorDiv(x, y));
            }
        if (Operation == 8)
            {
            System.out.println("__________________________________________________________________________________________________________");
            System.out.println("|1 = Sine|2 = Cosine|3 = Tangent|");
            System.out.println("Enter Trigometric Function: ");
            Scanner operation2 = new Scanner(System.in);
            long Operation2 = operation2.nextLong();
            if (Operation2 == 1)
                {
                System.out.println("Enter Number: ");
                Scanner betax = new Scanner(System.in);
                double x = operation.nextInt();
                System.out.println("__________________________________________________________________________________________________________");
                System.out.println(Math.sin(x));
                }
            if (Operation2 == 2)
                {
                System.out.println("Enter Number: ");
                Scanner betax = new Scanner(System.in);
                double x = operation.nextInt();
                System.out.println("__________________________________________________________________________________________________________");
                System.out.println(Math.cos(x));
                }
            if (Operation2 == 3)
                {
                System.out.println("Enter Number: ");
                Scanner betax = new Scanner(System.in);
                double x = operation.nextInt();
                System.out.println("__________________________________________________________________________________________________________");
                System.out.println(Math.tan(x));
                }
            }
        if (Operation == 9)
            {
            System.out.println("__________________________________________________________________________________________________________");
            System.out.println("|1 = Hyperbolic Sine|2 = Hyperbolic Cosine|3 = Hyperbolic Tangent|");
            System.out.println("Enter Hyperbolic Function: ");
            Scanner operation3 = new Scanner(System.in);
            long Operation3 = operation3.nextLong();
            if (Operation3 == 1)
                {
                System.out.println("Enter Number: ");
                Scanner betax = new Scanner(System.in);
                double x = operation.nextInt();
                System.out.println("__________________________________________________________________________________________________________");
                System.out.println(Math.sinh(x));
                }
            if (Operation3 == 2)
                {
                System.out.println("Enter Number: ");
                Scanner betax = new Scanner(System.in);
                double x = operation.nextInt();
                System.out.println("__________________________________________________________________________________________________________");
                System.out.println(Math.cosh(x));
                }
            if (Operation3 == 3)
                {
                System.out.println("Enter Number: ");
                Scanner betax = new Scanner(System.in);
                double x = operation.nextInt();
                System.out.println("__________________________________________________________________________________________________________");
                System.out.println(Math.tanh(x));
                }
            }
        }
    }
}