package com.company;
import java.util.Random;
import java.util.Scanner;

class Game{
    int number;
    int inputNumber;
    int noOfGuesses=0;
    public  int getNoOfGuesses(){
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses){
        this.noOfGuesses=noOfGuesses;
    }
    Game(){
        Random rand=new Random();
        this.number= rand.nextInt(100);
    }
    void  takeUserInput(){
        System.out.println("Guess the number !");
        Scanner S=new Scanner(System.in);
        inputNumber=S.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber==number){
            System.out.format("\nYou guessed it right! It was %d and was guessed in %d no. of times.",inputNumber,noOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("To Low!");
        }
        else if (inputNumber>number){
            System.out.println("To high!");
        }
        return false;
    }

}
public class TASOO_EXERCISE_03 {
   /* Create a class Game, which allows a user to play "Guess the Number"
    game once. Game should have the following methods:
    1. Constructor to generate the random number
    2. takeUserInput() to take a user input of number
    3. isCorrectNumber() to detect whether the number entered by the user is true
    4. getters and setters for no0fGuesses
    Use properties such as noOfGuesses (int), e t c to get this task done!*/


    public static void main(String[] args) {
        Game G=new Game();
        boolean b=false;
        while (!b){
            G.takeUserInput();
            b=G.isCorrectNumber();
        }
    }
}


