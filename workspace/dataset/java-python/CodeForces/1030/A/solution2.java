/* * To change this license header, choose License Headers in Project Properties. * To change this template file, choose Tools | Templates * and open the template in the editor. *///package myjavaproject;import java.util.Scanner; /** * * @author User */public class cForces1030A {        public static void main(String[] args) {                Scanner scan = new Scanner(System.in);                int n = scan.nextInt();        int p = 0;        int no = 0;                for(int i=1;i<=n;i++){                        p = scan.nextInt();                        if(p==1) no++;                    }                if(no>0) System.out.println("HARD");        else System.out.println("EASY");            }    }