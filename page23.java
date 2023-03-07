import javax.swing.*;


public class page23 {
    private int numcountry; 

    public page23(int numcountry){
        this.numcountry=numcountry; 
    }
    public int getNumcountry(){
        return numcountry; 
    }

    public void switchcountry(){
        switch(numcountry){
            case 1: 
            JOptionPane.showMessageDialog(null,"Country: Saudi Arabia. Capital: Ryiadh"); 
            break; 

            case 2: 
            JOptionPane.showMessageDialog(null,"Country: United Kingdom. Capital: London"); 
            break; 
            
            case 3: 
            JOptionPane.showMessageDialog(null,"Country: United States of America. Capital: Washington D.C"); 
            break; 

            case 4: 
            JOptionPane.showMessageDialog(null,"Country: Canada. Capital: Ottawa"); 
            break; 

            case 5: 
            JOptionPane.showMessageDialog(null,"Country: France. Capital: Paris"); 
            break; 

            case 6: 
            JOptionPane.showMessageDialog(null,"Country: Germany. Capital: Berlin"); 
            break; 

            case 7: 
            JOptionPane.showMessageDialog(null,"Country: Italy. Capital: Rome"); 
            break; 

            case 8: 
            JOptionPane.showMessageDialog(null,"Country: Tunisia. Capital: Tunis"); 
            break; 

            case 9: 
            JOptionPane.showMessageDialog(null,"Country: Morocco. Capital: Rabat"); 
            break; 
            
            case 10: 
            JOptionPane.showMessageDialog(null,"Country: Algeria. Capital: Algers"); 
            break; 

            default: 
            JOptionPane.showMessageDialog(null,"No country found"); 
            break; 
        }
    }
}
