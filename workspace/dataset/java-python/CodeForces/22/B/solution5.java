import java.util.*;import java.awt.*; public class p22B {    public static void main(String args[]){        Scanner in = new Scanner(System.in);         int n = in.nextInt();        int m = in.nextInt();          /*        //char[][] room = new char[n][m];          //for(int i = 0; i < n; i++){          //  room[i] = in.next().toCharArray();        //}        char[][] grid = new char[n][m];        for (int i = 0; i < n; i++) grid[i] = in.next().toCharArray();          int largest = 0;        for(int x = 0; x < n; x++){            for(int y = 0; y < m; y++){                for(int x2 = 0; x2 < n; x2++){                    for(int y2 = 0; y2 < m; y2++){                        boolean temp = false;                         search:                        for(int searchX = x; searchX <= x2; searchX++) {                            for (int searchY = y; searchY <= y2; searchY++) {                                if (grid[searchX][searchY] == '1') {                                    temp = true;                                    break search;                                }                            }                        }                         if(!temp) {                            int peri = (x2 - x + 1 + y2 - y + 1) * 2;                            if (peri > largest) {                                //System.out.println(x + ", " + y + "  " + x2 + ", " + y2);                                largest = peri;                            }                        }                    }                }            }        }         System.out.println(largest);  */           char[][] room = new char[n][m];        for (int i = 0; i < n; i++){            room[i] = in.next().toCharArray();        }         int largest = 0;        for (int x = 0; x < n; x++) {            for (int y = 0; y < m; y++) {                for (int x2 = x; x2 < n; x2++) {                    for (int y2 = y; y2 < m; y2++) {                        boolean temp = false;                         search:                        for (int searchX = x; searchX <= x2; searchX++) {                            for (int searchY = y; searchY <= y2; searchY++) {                                if (room[searchX][searchY] == '1') {                                    temp = true;                                    break search;                                }                            }                        }                        if (!temp) {                            int size = (x2 - x + 1 + y2 - y + 1) * 2;                            if (size > largest){                                largest = size;                            }                        }                    }                }            }        }        System.out.println(largest);                 }}