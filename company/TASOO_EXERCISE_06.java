package com.company;
/*create a custom calculator with following operations
1.ADDITION
2.SUBTRACTION
3.MULTIPLICATION
4.DIVISION */
/*The following exceptions are as follows:
1.Invalid input exception
2.cannot divide by zero
3.Max input exception >100000
4.Max multiplier reached exception i.e, multiplication is !>7000
 */

class InvalidInputException extends Exception{
    public  String toString(){
        return "Cannot add 8 & 9";
    }
    public String getMessage(){
        return "I am";
    }
}
class CannotDivideByZeroException extends Exception{
    public  String toString(){
        return "Cannot divide by 0";
    }
    public String getMessage(){
        return "I am";
    }
}
class MaxInputException extends Exception{
    public  String toString(){
        return "Cannot accept value above 100000";
    }
    public String getMessage(){
        return "I am";
    }
}
class MaxMultiplyException extends Exception{
    public  String toString(){
        return "Cannot accept value above 7000";
    }
    public String getMessage(){
        return "I am";
    }
}
class CustomCalculator {
    double add(double a,double b) throws InvalidInputException,MaxInputException{
        if (a>100000||b>100000){
            throw new MaxInputException();
        }

        if(a==8 || b==9){
            throw new InvalidInputException();
        }
        return a+b;
    }
    double subtract(double a,double b) throws MaxInputException{
        if (a>100000||b>100000){
            throw new MaxInputException();
        }
        return a-b;
    }
    double multiply(double a,double b) throws MaxInputException,MaxMultiplyException{
        if (a>7000||b>7000){
            throw new MaxMultiplyException();
        }
        if (a>100000||b>100000){
            throw new MaxInputException();
        }
        return a*b;
    }
    double divide(double a,double b) throws CannotDivideByZeroException,MaxInputException{
        if (a>100000||b>100000){
            throw new MaxInputException();
        }
        if(b==0){
            throw new CannotDivideByZeroException();
        }
        return a/b;
    }
}

public class TASOO_EXERCISE_06 {
    public static void main(String[] args) throws InvalidInputException,CannotDivideByZeroException,MaxInputException,MaxMultiplyException{
        CustomCalculator C= new CustomCalculator();
//        C.add(200000,9);
//        C.divide(6,0);
        C.multiply(8000,788);


    }
}
