public class Main{
    public static void main(String[] args) {
        Main b=new Main();
    //	b.show(1);
       // b.table(3);
      // b.tablewithoutloop(3,1);
         int c =  b.factorial(5);
         System.out.println(c);
        }
        public void show(int a)
        {
            if(a<=10){
                System.out.println(a);
                show(a+1);
            }
        }
    
            public void table(int n)
            {
                for(int i=1;i<=10;)
                {
                    System.out.println(i*n);
                    i++;
                }
            }
            public void tablewithoutloop(int n,int a)
            {
                if(a<=10){
                System.out.println(n*a);
                tablewithoutloop(n,++a);
                }
            }
            public int factorial(int n)
            {
                if(n==1 || n==0)
                
                    return  1 ;
                    else
                    return (n*factorial(n-1));
                
            }
}
