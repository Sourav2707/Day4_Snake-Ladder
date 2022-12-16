package com.day4_snake_ladder;
import java.util.Random;
public class SnakeLadder {
    static final int startPosition = 0;
    public static void main(String[] args) {
        System.out.println("Welcome to snake and ladder program");
        int dieNumber;
        int position =startPosition;
        Random rnd = new Random();
        System.out.println("current position : "+position);
        dieNumber = rnd.nextInt(1,7);

        System.out.println("Die Number = "+dieNumber);
    }
}
