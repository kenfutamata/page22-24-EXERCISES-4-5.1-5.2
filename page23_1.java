import javax.swing.*;

public class page23_1 {
    public static void main(String[] args) {
        int numcountry; 

        numcountry = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number country: ")); 

        page23 j1 = new page23(numcountry); 
        j1.switchcountry(); 
    }
}
