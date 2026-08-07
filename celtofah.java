import java.util.Scanner;
public class CeltoFah {
    public static void main(String[]args){
    
    Scanner input=new Scanner(System.in);
    double cel,fah;
    System.out.println("Enter an celsius:");
    cel=input.nextDouble();
    fah=9/5*cel+32;
     System.out.println("fahrenheit="+fah);
    
    }
}