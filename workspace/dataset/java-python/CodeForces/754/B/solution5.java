import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.*;import java.util.stream.IntStream;import javafx.util.Pair; public class Main{     static void sort(int a[])    {        Random ran = new Random();        for (int i = 0; i < a.length; i++) {            int r = ran.nextInt(a.length);            int temp = a[r];            a[r] = a[i];            a[i] = temp;        }         Arrays.sort(a);    }    static int a[];    static int last=0;    public static void main(String[] args) throws IOException    {        Scanner input = new Scanner(System.in);      char a[][] = new char[4][4];        for (int i = 0; i < 4; i++) {            String s = input.next();            a[i] = s.toCharArray();        }        for (int i = 0; i < 4; i++) {            for (int j = 0; j < 4; j++) {                if(a[i][j]=='.')                {                    if(i-1>=0&&j-1>=0&&a[i-1][j-1]=='x'&&i+1<4&&j+1<4&&a[i+1][j+1]=='x')                    {                        System.out.println("YES");                        return;                    }                    if(i-1>=0&&i+1<4&&a[i-1][j]=='x'&&a[i+1][j]=='x')                    {                        System.out.println("YES");                        return;                                            }                    if(i-1>=0&&j+1<4&&i+1<4&&j-1>=0&&a[i-1][j+1]=='x'&&a[i+1][j-1]=='x')                    {                        System.out.println("YES");                        return;                    }                    if(j-1>=0&&j+1<4&&a[i][j-1]=='x'&&a[i][j+1]=='x')                    {                        System.out.println("YES");                        return;                    }                }                else if(a[i][j]=='x')                {                    if(i-1>=0&&j-1>=0&&a[i-1][j-1]=='x'&&i+1<4&&j+1<4&&a[i+1][j+1]=='.')                    {                        System.out.println("YES");                        return;                    }                    if(i-1>=0&&j-1>=0&&a[i-1][j-1]=='.'&&i+1<4&&j+1<4&&a[i+1][j+1]=='x')                    {                        System.out.println("YES");                        return;                    }                    if(i-1>=0&&i+1<4&&a[i-1][j]=='x'&&a[i+1][j]=='.')                    {                        System.out.println("YES");                        return;                                            }                    if(i-1>=0&&i+1<4&&a[i-1][j]=='.'&&a[i+1][j]=='x')                    {                        System.out.println("YES");                        return;                                            }                    if(i-1>=0&&j+1<4&&i+1<4&&j-1>=0&&a[i-1][j+1]=='x'&&a[i+1][j-1]=='.')                    {                        System.out.println("YES");                        return;                    }                    if(i-1>=0&&j+1<4&&i+1<4&&j-1>=0&&a[i-1][j+1]=='.'&&a[i+1][j-1]=='x')                    {                        System.out.println("YES");                        return;                    }                    if(j-1>=0&&j+1<4&&a[i][j-1]=='x'&&a[i][j+1]=='.')                    {                        System.out.println("YES");                        return;                    }                    if(j-1>=0&&j+1<4&&a[i][j-1]=='.'&&a[i][j+1]=='x')                    {                        System.out.println("YES");                        return;                    }                }            }        }        System.out.println("NO");            }             }