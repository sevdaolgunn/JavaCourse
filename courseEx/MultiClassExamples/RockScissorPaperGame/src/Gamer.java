import java.util.Scanner;

public class Gamer {

    String name;

    int numberofWins;

    static int numberofDraws;
    static int numberofTrials;

    HandSign handSign;

    Gamer(String name){
        this.name = name;
    }

    void move(){
        if(Arena.isGameOver) return;
        boolean isInputInvaild = false;

        Scanner userInput = new Scanner(System.in);
        System.out.println("please enter q for quit, " + "r for rock, s for scissor, p for paper");


    }


}
