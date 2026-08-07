import java.util.Scanner;
public class FibonacciDemo{
  public static void main(String[]args){
      
      Scanner input=new Scanner(System.in);
      
      int num,first=0,second=1,fibo;
      System.out.println("How many numbers:");
     num =input.nextInt();
     System.out.println(first+""+second);
      for(int i=3;i<=num;i++){
          
          fibo=first+second;
          System.out.println(""+fibo);
          first=second;
          second=fibo;
      }
     
      
      
      
  }  
    
}