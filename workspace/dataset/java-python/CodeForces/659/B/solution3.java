 /*package whatever //do not write package name here */ import java.util.*;import java.lang.*;import java.io.*;import java.util.Arrays;import java.util.Collections;import java.util.Scanner;import java.io.DataInputStream; import java.io.FileInputStream; import java.io.IOException; import java.io.InputStreamReader;import java.io.Reader;import java.io.BufferedReader; import java.io.IOException; import java.io.InputStreamReader; import java.util.StringTokenizer;  public class GFG {        public static int Sort(StudentDetails x,StudentDetails y){                if(x.Region != y.Region)            return x.Region - y.Region;                      if(x.Score > y.Score)                return -1;        if(x.Score < y.Score)                return 1;            return x.Name.compareTo(y.Name);        }	public static void main (String[] args) {	    		Scanner sc=new Scanner(System.in);		        int n = sc.nextInt();        int m = sc.nextInt();        StudentDetails arr[] = new StudentDetails[n];                for(int j=0;j<n;j++){            String Name;            int Region,Score;                        Name = sc.next();            Region = sc.nextInt();            Score = sc.nextInt();                        StudentDetails obj = new StudentDetails(Name,Region,Score);            arr[j] = obj;        }        Arrays.sort(arr,(x,y)->Sort(x,y));        boolean label = false;        int count = 1;        for(int j=1;j<n;j++){                        if(arr[j].Region == arr[j-1].Region){                count++;            }            else{                if(count == 2){                    System.out.println(arr[j-2].Name +" "+arr[j-1].Name);                }                count = 1;                            }            if(count == 2 && j == n-1){                System.out.println(arr[j].Name +" "+arr[j-1].Name);            }            if(count == 3){                if(arr[j].Score == arr[j-1].Score)                {                    System.out.println("?");                                }                else{                    System.out.println(arr[j-2].Name +" "+arr[j-1].Name);                                }            }                    }    }}class StudentDetails{    String Name;    int Region,Score;    public StudentDetails(String name,int region,int score){        Name = name;        Region = region;        Score = score;    }}
