
    import java.util.Scanner;
    public class FizzBuzz {

    public static void main(String[] args)
    {
        int i;
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        
         
        for(i=1;i<=n;i++)
        {
         if(i%3==0 && i%5==0)
        {
            System.out.print("FizzBuzz");
        }
        else  if(i%3 == 0)
            {
                System.out.print("Fizz");
                
            }
        else if(i%5==0)
        {
            System.out.print("Buzz");
            
        }
        else{
            System.out.print(i);
        }
        System.out.print("\",\"");
        
        
        }   
        c.close();
        
    }
}

