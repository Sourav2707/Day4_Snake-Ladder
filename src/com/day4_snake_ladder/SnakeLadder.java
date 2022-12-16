package com.day4_snake_ladder;
import java.util.Random;
public class SnakeLadder {
    static final int startPosition = 0;
    static final int ladderOption = 2;
    static final int snakeOption = 1;
    static int position;
    public static void main(String[] args) {
        System.out.println("Welcome to snake and ladder program");
        position = startPosition;
        do {
            int dieNumber, option;
            Random rnd = new Random();
            dieNumber = rnd.nextInt(1, 7);
            option = rnd.nextInt(1, 3);
            System.out.println("Die Number = " + dieNumber);

            switch (option) {
                case ladderOption:
                    System.out.println("ladder option");
                    position += dieNumber;
                    break;
                case snakeOption:
                    System.out.println("snake option");
                    position -= dieNumber;
                    if (position < 0) {
                        System.out.println("The player bit by snake");
                        position = 0;
                    } else {
                        System.out.println("The player bit by snake");
                    }
                    break;
                default:
                    System.out.println("No Play option");
                    break;
            }
            System.out.println("current position : " + position+"\n");
            if(position > 100)
                position = 0; // there are possibilities the position may exclued 100 between 101 to 105. so making the position as 0.
        }while (position < 100);
    }
}
