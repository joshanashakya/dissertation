         import java.io.PrintWriter;    import java.io.BufferedReader;    import java.io.InputStreamReader;    import java.math.BigInteger;    import java.util.Scanner;    import java.util.*;    import java.io.BufferedReader;    import java.io.IOException;    import java.io.InputStream;    import java.io.InputStreamReader;    import java.io.BufferedWriter;    import java.io.DataInputStream;    import java.io.File;    import java.io.FileInputStream;    import java.io.OutputStreamWriter;    import java.util.InputMismatchException;    import jdk.nashorn.internal.codegen.CompilerConstants;         public class Solution{        public static void             main(String [] args)throws IOException{                             // Scanner sc=new Scanner(System.in);             BufferedReader br=new BufferedReader(new InputStreamReader(System.in));             Scanner sc=new Scanner(new File("input.txt"));    		PrintWriter out=new PrintWriter("output.txt");    		if(sc.nextLine().equals("front"))    			if(sc.nextInt()==1)    				out.println("L");    			else    				out.println("R");    		else    			if(sc.nextInt()==1)    				out.println("R");    			else    				out.println("L");    		out.close();                                                }                 }
