	import java.math.BigInteger;	import java.util.ArrayList;	import java.util.Arrays;	import java.util.Collections;	import java.util.HashMap;	import java.util.Iterator;	import java.util.List;	import java.util.Scanner;		public class SequenceWithDigits {			static Scanner sc= new Scanner(System.in);		static List<Integer> C;		static List<Integer> B;								public static void main(String[] args) {								String s=sc.next();			HashMap<Character,Long> map=new HashMap<>();			for(int i=0;i<s.length();i++) {				char key=s.charAt(i);				if(!map.containsKey(key))map.put(key, 1l);				else map.put(key, map.get(key)+1l);							}			long ans=0;			for(HashMap.Entry<Character,Long> entry:map.entrySet()) {				ans+=Math.pow(entry.getValue(),2);			}			System.out.println(ans);		}				}