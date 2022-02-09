
package adarsh.fibonacci;
   import java.util.Scanner;

public class Input {
    
        public static void main(String[] args) 

        {

            int n, a = 0, b = 1,c;
            System.out.println(a+"");
            System.out.println(b+"");

            Scanner s = new Scanner(System.in);

            System.out.println("Enter value of n:");

            n = s.nextInt();

            System.out.println("Fibonacci Series:");

            for(int i = 1; i <= n; i++)

            {

              

                c = a + b;
              System.out.println(c+" ");
              a=b;
              b=c;

            }

        }

    }

