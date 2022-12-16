package com.day4_snake_ladder;

public class PlayerMain {
    public static void main(String[] args) {
        int win = 100;
        SnakeLadder player1 = new SnakeLadder();
        SnakeLadder player2 = new SnakeLadder();
        System.out.println("The starting position of player is "+player1.position);
        System.out.println("\n");
        do {
            System.out.println("Player 1::::::::::::::::::::::::");
            System.out.println("Current count of die roll till now "+player1.roll);
            player1.player();
            if ((player1.option == 1) && (player1.position < win)) {
                System.out.println("Player 1:::::::::::::::::::::");
                player1.player();
            }
            if (player1.position > win) {
                player1.position = 0;
            }
            if (player1.position == win) {
                System.out.println("Player 1 won the game");
                break;
            }
            System.out.println("Player 2::::::::::::::::::::::::::::");
            System.out.println("Current count of die roll till now "+player1.roll);
            player2.player();
            if ((player2.option == 1) && (player2.position < win)) {
                System.out.println("Player 2::::::::::::::::::::::::");
                player2.player();
            }
            if (player2.position > win) {
                player2.position = 0;
            }
            if (player2.position == win) {
                System.out.println("Player 2 won the game");
            }
        }while (player1.position < win || player2.position < win);
    }
}
