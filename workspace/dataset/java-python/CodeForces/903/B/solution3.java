import java.util.Scanner;public class Main{    public static void main(String[] args){        Scanner scan = new Scanner(System.in);        int h1 = scan.nextInt();        int a1 = scan.nextInt();        int c = scan.nextInt();        int h2 = scan.nextInt();        int a2 = scan.nextInt();        int i = 0, heal = 0, strike = 0;        while(h2 > 0){            if(h1 <= a2){				if(h2 <= a1){					h2 -= a1;					strike ++;				}                else{					h1 = h1 - a2 + c;					heal ++;				}            }            else{                h2 -= a1;				h1 -= a2;                strike ++;            }			i ++;		}        System.out.println(i);        for(i = 0; i < heal; i ++)            System.out.println("HEAL");		for(i = 0; i < strike; i ++)			System.out.println("STRIKE");        }    }