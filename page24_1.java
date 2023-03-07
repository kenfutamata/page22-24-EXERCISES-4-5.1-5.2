import java.util.Scanner; 
public class page24_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int num1; 
        int num2; 
        char select; 

        System.out.print("Enter number 1: "); 
        num1 = input.nextInt();
        System.out.print("Enter number 2: "); 
        num2 = input.nextInt();
        System.out.print("A-Addition\n");
        System.out.print("B-Subtraction\n");
        System.out.print("S-Multiplication\n"); 
        System.out.print("D-Division\n");
        System.out.print("\nEnter a character for the operation: ");
        select=input.next().charAt(0);  
        page24 j1 = new page24(num1, num2, select); 
        page24_2 j2 = new page24_2(num1, num2, select);
        j1.ifSelect(); //please commemt this line if you want to use the if else encapsulation
        j2.switchSelect(); //please comment this line if you want to use the switch statement

    }
}
