import java.util.Scanner;

public class If_else_if {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int x= s.nextInt();
        int y= s.nextInt();

        if(x>y)
        System.out.println("The Max is "+ x);
        else if (x<y) 
        System.out.println("The Max is "+ y);
        else
        System.out.println("Both are equal"); 
        


       

    }
}
