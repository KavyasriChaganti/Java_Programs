public class gcd { 
    public static void main(String[] args){
         int a=12,b=18,r=0;
          r=a%b;
         System.out.print("GCD OF "+a+" and "+b+" is  ");
         while(r!=0)
            {
                  a=b;
                  b=r; 
                  r=a%b;
                  }
         System.out.print(b);
              
}
}
