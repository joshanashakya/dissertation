 import java.util.*;  public class Main {        public static void main(String[] args) {        Scanner input = new Scanner(System.in);      int row,col,k;      row = input.nextInt();      col = input.nextInt();      k = input.nextInt();      int a[][] = new int[row+1][col+1];        for (int i = 0; i < row; i++)Arrays.fill(a[i], 0);        for (int i = 0; i < k; i++) {            int check1=0,check2=0,check3=0,check4=0;            int x = input.nextInt();            int y = input.nextInt();            a[x][y]=1;                        if(x-1>=0)            {                if(a[x-1][y]==1)                {                      check1++;                check4++;                }                              }            if(x-1>=0 &&y-1>=0)            {                if(a[x-1][y-1]==1)                    check1++;                            }            if(y-1>=0)            {                if(a[x][y-1]==1)                {                   check1++;                check2++;                 }                                }            if(x+1<(row+1) &&y-1>=0)            {                if(a[x+1][y-1]==1)                    check2++;            }            if(x+1<(row+1))            {                if(a[x+1][y]==1)                {                    check2++;                    check3++;                }            }            if(x+1<(row+1)&&y+1<(col+1))            {                if(a[x+1][y+1]==1)                    check3++;            }            if(y+1<(col+1))            {                if(a[x][y+1]==1)                {                    check3++;                    check4++;                                    }            }            if(x-1>=0 && y+1<(col+1))            {                if(a[x-1][y+1]==1)                    check4++;            }                                                if(check1==3||check2==3||check3==3||check4==3)            {                System.out.println(i+1);                return;                            }                                }        System.out.println("0");                       }   } 