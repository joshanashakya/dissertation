import java.util.Scanner; public class CodeForces {     public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int totalLine = sc.nextInt();        int[] birdsPerLine = new int[totalLine+1];        birdsPerLine[0] = 0;        for(int i = 1; i <= totalLine; i++){            birdsPerLine[i] = sc.nextInt();        }        int totalShoot = sc.nextInt();                for(int i = 0; i < totalShoot; i++){            int shootedLine = sc.nextInt();            int shootedBirdPosition = sc.nextInt();            if(totalLine == 1){                birdsPerLine[1] = 0;                break;            }            if(shootedLine == 1){                birdsPerLine[shootedLine + 1] += (birdsPerLine[shootedLine] - shootedBirdPosition);            }            else if(shootedLine == totalLine){                birdsPerLine[shootedLine - 1] += (shootedBirdPosition - 1);            }            else{                birdsPerLine[shootedLine - 1] += (shootedBirdPosition - 1);                birdsPerLine[shootedLine + 1] += (birdsPerLine[shootedLine] - shootedBirdPosition);            }            birdsPerLine[shootedLine] = 0;        }        for(int i = 1; i <= totalLine; i++){            System.out.println(birdsPerLine[i]);        }    }}
