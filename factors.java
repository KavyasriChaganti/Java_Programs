public class factors{
   public static void main(String[] args){
        int n=30,i=0;
        System.out.println("\n The FACTORS of "+n+"  are ");
        for(i=1;i<n/2;i++)
             {
                 if(n%i==0)
                      System.out.print("   "+i);
               }
      
 }
}
