import java.util.*;import java.util.regex.*;import java.io.*; public class shapur_corrections{    public static void main(String[] args) {        Scanner scan = new Scanner(System.in);        String s1 = (scan.next()).replaceAll("[;\\-_]*","").toLowerCase();        String s2 = (scan.next()).replaceAll("[;\\-_]*","").toLowerCase();        String s3 = (scan.next()).replaceAll("[;\\-_]*","").toLowerCase();        Pattern pat1 = Pattern.compile(s1);        Pattern pat2 = Pattern.compile(s2);        Pattern pat3 = Pattern.compile(s3);        String s4 = s1+s2+s3;        //String s = s4.replaceAll("[;\\-_]*","");        //String k=s.toLowerCase();         //System.out.println(k);        int n = scan.nextInt();        String str[] = new String[n];        for(int i=0;i<n;i++){            String ans = scan.next();            String a = ans.replaceAll("[;\\-_]*","");            String m=a.toLowerCase();            /*Matcher mat1 = pat1.matcher(m),mat2=pat2.matcher(m),mat3=pat3.matcher(m);            boolean m1=mat1.find(),m2=mat2.find(),m3=mat3.find();            //System.out.println(m);*/            if(m.equals(s1+s2+s3) || m.equals(s1+s3+s2) || m.equals(s2+s1+s3) || m.equals(s2+s3+s1) || m.equals(s3+s2+s1) || m.equals(s3+s1+s2))                str[i] = "ACC";            else                str[i] = "WA";        }        for(int i=0;i<n;i++){            System.out.println(str[i]);        }            }}  	 		  		 		 	   				   	 	