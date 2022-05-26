package MyTry;

import java.util.Scanner;

public class projects {

    public static void displayHingScorePostion(String playerName,int HighscorePostion){
        System.out.println(playerName +" Managed to get into postion : "+HighscorePostion+" on the high score table");
    }

    public static int calculatehighscorePostion(int playerscore){
        if(playerscore > 1000){
            return 1;
        }else if(playerscore >= 500 && playerscore < 1000){
            return 2;
        }else if(playerscore > 100 && playerscore < 500){
            return 3;
        }else{
            return 4;

        }
    }

    public static void main(String[]args){
        int highscoreP = calculatehighscorePostion(1500);
        displayHingScorePostion("Tim",highscoreP);

        highscoreP = calculatehighscorePostion(900);
        displayHingScorePostion("Bob",highscoreP);

        highscoreP = calculatehighscorePostion(40);
        displayHingScorePostion("Kim",highscoreP);

        highscoreP = calculatehighscorePostion(200);
        displayHingScorePostion("gem",highscoreP);


    }
}
