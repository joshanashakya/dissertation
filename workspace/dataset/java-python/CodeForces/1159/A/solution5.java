import java.util.Scanner;import java.util.Stack; public class problem49 { 	public static void main(String[] args) {		// TODO Auto-generated method stubScanner sc = new Scanner(System.in);Stack<Integer> stack = new Stack<>();int t = sc.nextInt();sc.nextLine();  String s = sc.nextLine(); 	//System.out.println(stack.size());for(int i = 0;i<s.length();i++){	if(s.charAt(i)=='-')	{		if(!stack.isEmpty())			stack.pop();	}	else		stack.push(1);}System.out.println(stack.size()); 	} }
