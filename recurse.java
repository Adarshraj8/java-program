import java.util.*;
public class recurse{
  public static int fac(int n){
if(n==0)
{
   return 1;
}
else{
   return(n*fac(n-1));
}
}
public static void main(String[] args){
   Scanner t = new Scanner(System.in);
   int n= t.nextInt();
   int facto = fac(n);
   System.out.println("" +facto);
}
}
