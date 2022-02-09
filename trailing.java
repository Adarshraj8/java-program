import java.util.*;
public class trailing {
    public static int trailingZeroes(int n) 
    {
        int count =0;
        while(n>0)
        {
            n = n/5;
            count += n;
        }
        return count;
}
public static void main(String[] args)
{
    Scanner t = new Scanner(System.in);
    System.out.println("Enter the Number");
    int a = t.nextInt();
    System.out.println(trailingZeroes(a));
}

}
