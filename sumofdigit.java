import java.util.Scanner;
public class SumofDigit{
  public static void main(String[]args){
      
      Scanner input=new Scanner(System.in);
      
      int num,r,sum=0,temp;
      System.out.println("Enter the number:");
     num =input.nextInt();
      temp = num;
      while(temp!=0){
          r=temp%10;
          sum=sum+r;
          temp=temp/10;
          
      }
      
      System.out.println("sum="+sum);
      
  }  
    
}