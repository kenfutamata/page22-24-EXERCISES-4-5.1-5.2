public class page22{
    private int num1; 
    private int num2; 
    private int select; 

    public page22(int num1, int num2, int select){
        this.num1=num1; 
        this.num2=num2; 
        this.select=select; 
    }
    public int getNum1(){
        return num1;
    }
    public int getNum2(){
        return num2; 
    }
    public int getSelect(){
        return select; 
    }

    public void decidemath(){
        if(getSelect() == 1){
            int sum= getNum1() +getNum2(); 
            System.out.printf("Sum: %d + %d = %d", getNum1(), getNum2(), sum); 
        }
        else if(getSelect() == 2){
            int sum= getNum1() +getNum2(); 
            int average = getNum1() +getNum2();
            double average2 = (double)average/2;
             
            System.out.printf("Sum: %d + %d = %d\n", getNum1(), getNum2(), sum); 
            System.out.print("Average:"+""+getNum1()+" and"+" "+getNum2()+" "+" ="+" "+average2); 
             
        }
        else if(getSelect() == 3){
            int sum= getNum1() +getNum2(); 
            int average = getNum1() +getNum2();
            Double average2 = (double) average/2;
          
            System.out.printf("Sum: %d + %d = %d\n", getNum1(), getNum2(), sum); 
            System.out.print("Average:"+""+getNum1()+" and"+" "+getNum2()+" ="+" "+average2); 
            System.out.print("\n"+"Max:"+""+getNum1()+" and"+" "+getNum2()+" "+Math.max(getNum1(), getNum2())); 
            System.out.print("\n"+"Max:"+""+getNum1()+" and"+" "+getNum2()+" "+Math.min(getNum1(), getNum2())); 
        }
        
    }
}