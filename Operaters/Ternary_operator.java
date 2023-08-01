import java.util.Scanner;

public class Ternary_operator {
    
    public static void main(String[] args) {
       System.out.println("Enter the number:");
        Scanner s=new Scanner (System.in);
        int x= s.nextInt();
        String msg= x % 5==0 ? "Divisible" : "Not Divisible" ; // Ternary operator
        System.out.println(msg);
    }
}
