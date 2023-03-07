import java.util.Scanner;
public class page22_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int num1; 
        int num2; 
        int select; 

        System.out.print("Enter two integer numbers: "); 
        num1=input.nextInt(); 
        num2=input.nextInt();
        
        System.out.print("****************************\n"); 
        System.out.print("*                          *\n"); 
        System.out.print("* 1.Sum                     *\n");
        System.out.print("* 2.Sum and average         *\n"); 
        System.out.print("* 3.Sum, average, max and min *\n");
        System.out.print("*******************************\n"); 
        System.out.print("Choose your option [1,2,3]: ");
        select=input.nextInt(); 
        page22 j1 = new page22(num1, num2, select); 
        j1.decidemath();     
    }
}
