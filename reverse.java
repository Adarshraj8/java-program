import java.util.*;
public class reverse {
    public static void main(String[] args){
        String exact ="",reverse ="";
    
        while(!exact.contains("exit"))
        {
          Scanner input = new Scanner(System.in);
          exact ="";
          reverse = "";
          System.out.println("Enter a sentence to be reversed");
        
        exact = input.nextLine();
         int length = exact.length();
        for(int i = length-1;i>=0;i--)
    
         reverse = reverse + exact.charAt(i);
            System.out.println(reverse);  
    }
    }
}
