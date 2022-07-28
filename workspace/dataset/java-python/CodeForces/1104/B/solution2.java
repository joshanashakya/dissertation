// Reference Link   : https://codeforces.com/contest/1104/problem/Bimport java.util.Scanner;import java.util.Stack; /** * TwoFriendConsecutiveCharacterDeletionGame */public class TwoFriendConsecutiveCharacterDeletionGame {     private static char switchPlayerChance(char currentPlayer) {        switch(currentPlayer) {            case 'A': {                return 'B';            }            case 'B': {                return 'A';            }        }        return 'A';    }    static int playerAPoints = 0;    static int playerBPoints = 0;    static void incrementScoreOfPlayer(char currentPlayer) {        switch(currentPlayer) {            case 'A': {                playerAPoints++;                break;            }            case 'B': {                playerBPoints++;                break;            }        }    }    public static void main(String[] args) {        Scanner scan = new Scanner(System.in);        Stack<Character> stack = new Stack<>();        char playerChance = 'A';         String inputString = scan.nextLine();        for(int i = 0 ; i < inputString.length() ; ++i) {            char character = inputString.charAt(i);            // System.out.print(i + " " + stack + " " + playerChance + " -" + character + "-> ");             if (!stack.empty() && (stack.peek() == character)) {                stack.pop();                incrementScoreOfPlayer(playerChance);                playerChance = switchPlayerChance(playerChance);            } else{                stack.push(character);            }            // System.out.println(i + " " + stack + " " + playerChance);        }                scan.close();         System.out.println((playerAPoints > playerBPoints ? "Yes" : "No"));;    }}
