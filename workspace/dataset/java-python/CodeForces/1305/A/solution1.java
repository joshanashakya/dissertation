import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.Arrays;import java.util.ArrayList;import java.util.Arrays;import java.util.Collections;import java.util.HashMap;import java.util.LinkedList;import java.util.Locale;import java.util.Objects;import java.util.Queue;import java.util.Scanner;import java.util.Stack;import java.util.TreeSet;import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.lang.reflect.Array;import java.math.BigInteger;import java.util.ArrayList;import java.util.Arrays;import java.util.Map;import java.util.Vector; /** * * @author acer */public class Main {     public static void main(String[] args) throws IOException {        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        int cases = Integer.parseInt(br.readLine());        while (cases > 0) {            int daughters = Integer.parseInt(br.readLine());            int[] necklaces = Arrays.stream(br.readLine().split(" ")).mapToInt(x -> Integer.parseInt(x)).toArray();            int[] bracelets = Arrays.stream(br.readLine().split(" ")).mapToInt(x -> Integer.parseInt(x)).toArray();            Arrays.sort(necklaces);            Arrays.sort(bracelets);            for (int i = 0; i < daughters; i++) {                if (i + 1 != daughters) {                    System.out.print(necklaces[i] + " ");                } else {                    System.out.println(necklaces[i]);                }            }            for (int i = 0; i < daughters; i++) {                if (i + 1 != daughters) {                    System.out.print(bracelets[i] + " ");                } else {                    System.out.println(bracelets[i]);                }            }            cases--;        }    } }  			  							 				 			
