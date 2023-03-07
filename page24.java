public class page24 {
    private int num1, num2;  
    private char select;  
   
   public page24(int num1, int num2, char select){
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
   public char getSelect(){
    return select; 
   }
   
   public void ifSelect(){
    if(getSelect()=='A'){
        int sum = getNum1()+getNum2(); 
        System.out.printf("The answer is: %d", sum); 
    }
    else if (getSelect()=='B'){
        int sub = getNum1()-getNum2(); 
        System.out.printf("The answer is: %d", sub);  
    }
    else if (getSelect()=='S'){
        int multi = getNum1()*getNum2(); 
        System.out.printf("The answer is: %d", multi); 
    }
    else if (getSelect()=='D'){
        Double divide = (double)getNum1()/getNum2();
       
        System.out.printf("The answer is: %.2f", divide); 
    }
   }

}
