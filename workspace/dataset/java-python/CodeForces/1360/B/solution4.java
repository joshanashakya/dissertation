import java.util.Scanner;import java.util.Arrays; public class HonestCoach {  public static void main(String[] args) {    Scanner sc = new Scanner(System.in);    int t = Integer.parseInt(sc.nextLine());    for (; t > 0; t--) {      int n = Integer.parseInt(sc.nextLine());      int[] s = new int[n];      for (int i = 0; i < n; i++)        s[i] = sc.nextInt();      sc.nextLine();      Arrays.sort(s);      int menorDiferencia = Integer.MAX_VALUE;      for (int i = 1; i < n; i++)         menorDiferencia = Math.min(s[i] - s[i-1], menorDiferencia);      System.out.println(menorDiferencia);    }  }}					 		      	 	  	 	 		 	 	 	