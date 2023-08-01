import java.util.Scanner;

public class Assignment_operator {
     public static void main(String[] args){
    System.out.println("Enter num1 op and num2 = ");
     Scanner sc =new Scanner (System.in);
     float f1= sc.nextFloat();
     char op = sc.next().charAt(0);
     float f2= sc.nextFloat(); 

if (op=='+')
     System.out.println(f1+f2);
else if (op=='-')
     System.out.println(f1-f2);
else if (op=='*')
     System.out.println(f1*f2);
else if (op=='/')
     System.out.println(f1/f2);
else 
     System.out.println("Invalid");
}
}
