public class PRIME
 {
  public static void main(String[]args)
   {
      int a=2,b=100,c,i,j;
      for(i=a;i<b;i++)
      {  
          c=1;
          for(j=2;j<i;j++)
              if(i%j==0)
                  c=0;
          if(c==1)
              System.out.print("   "+i);
      }        
  }    
}
