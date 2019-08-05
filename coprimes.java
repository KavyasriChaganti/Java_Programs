public class coprimes{ 
    public static void main(String[] args){
         int a=2,b=3,r=0;
          r=a%b;
         System.out.print(a+" and "+b+" are  ");
         while(r!=0)
            {
                  a=b;
                  b=r; 
                  r=a%b;
                  }
         if(b==1)
                System.out.print("  CO-PRIMES");
         else
                System.out.print("   NOT  CO-PRIMES");
                       
              
}
}
