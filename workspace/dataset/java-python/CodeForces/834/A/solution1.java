import java.util.*;public class Solution{    public static void main(String[] args){        Scanner s=new Scanner(System.in);        String s1=s.nextLine();                int n=s.nextInt();        char ch[]={'^','>','v','<'};        int p1=0,p2=0;        for(int i=0;i<4;i++){            if(ch[i]==s1.charAt(0))                p1=i;            if(ch[i]==s1.charAt(2))                p2=i;        }        int step=n%4;        if(step!=0 && step!=2){            if(ch[(p1+step)%4]==ch[p2]){                System.out.println("cw");            }            else if(ch[Math.abs(p2+step)%4]==ch[p1])                System.out.println("ccw");            else                System.out.println("undefined");        }        else          System.out.println("undefined");                }}
