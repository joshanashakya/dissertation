import java.util.*;import java.util.stream.*; public class Solution {	public static void main(String[] args) {		Scanner scan = new Scanner(System.in);		int n = scan.nextInt();		scan.nextLine();		String[] words = scan.nextLine().split(" ");		Set<Set<Character>> roots = new HashSet<>();		for(String w : words) {			Set<Character> root = new HashSet<>();			for(int i = 0; i < w.length(); i++) {				root.add(w.charAt(i));			}			roots.add(root);		}		System.out.println(roots.size());	}}
