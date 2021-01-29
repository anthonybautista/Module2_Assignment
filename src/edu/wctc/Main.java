package edu.wctc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Player player = new Player();
        Maze maze = new Maze(player);
        boolean done = false;
        char command;

        while (!done) {
            System.out.println(maze.getCurrentRoomDescription());
            System.out.println(maze.getCurrentRoomExits());
            System.out.println("Please enter the direction you would like to move. ('n','s','e','w','u','d')");
            System.out.println("Or you can type: 'i' to interact, 'l' to loot, 'x' to exit, or 'v' for inventory.");
            command = input.next().charAt(0);
            switch(command){
                case 'n':
                    if (maze.move('n')) {
                        System.out.println("Move successful!");
                        break;
                    } else {
                        System.out.println("You cannot move that direction.");
                        break;
                    }
                case 's':
                    if (maze.move('s')) {
                        System.out.println("Move successful!");
                        break;
                    } else {
                        System.out.println("You cannot move that direction.");
                        break;
                    }
                case 'e':
                    if (maze.move('e')) {
                        System.out.println("Move successful!");
                        break;
                    } else {
                        System.out.println("You cannot move that direction.");
                        break;
                    }
                case 'w':
                    if (maze.move('w')) {
                        System.out.println("Move successful!");
                        break;
                    } else {
                        System.out.println("You cannot move that direction.");
                        break;
                    }
                case 'u':
                    if (maze.move('u')) {
                        System.out.println("Move successful!");
                        break;
                    } else {
                        System.out.println("You cannot move that direction.");
                        break;
                    }
                case 'd':
                    if (maze.move('d')) {
                        System.out.println("Move successful!");
                        break;
                    } else {
                        System.out.println("You cannot move that direction.");
                        break;
                    }
                case 'i':
                    System.out.println(maze.interactWithCurrentRoom());
                    break;
                case 'l':
                    System.out.println(maze.lootCurrentRoom());
                    break;
                case 'x':
                    System.out.println(maze.exitCurrentRoom());
                    break;
                case 'v':
                    System.out.println(maze.getPlayerInventory());
                    break;
                default:
                    System.out.println("Invalid entry.");
            }
            done = maze.isFinished();
        }
        System.out.println("You finished the maze! Your score is: " + maze.getPlayerScore());
    }
}
