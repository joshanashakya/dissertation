import java.util.*;public class linguistics{		public static void main(String [] args){		Scanner sc = new Scanner(System.in);		String in = sc.nextLine();		char[] ch = in.toCharArray();		int n = ch.length;		TreeSet <String> ans = new TreeSet<>();		boolean[] dp2 = new boolean[n+1];		boolean[] dp3 = new boolean[n+1];		dp2[n] = true;		dp3[n] = true;		dp3[n-3] = true;		dp2[n-2] = true;		boolean s2,s3;	for (int i = n-1; i >= 5; i--) {	//s2 = (ch[i-3]==ch[i-1] && ch[i-2] == ch[i]);	//s3 = (ch[i-3]==ch[i] && ch[i-2] == ch[i+1] && ch[i-1] == ch[i+2]);      dp2[i-3] = dp3[i-1] || (i < n && dp2[i-1] && !(ch[i-3]==ch[i-1] && ch[i-2] == ch[i]));      dp3[i-3] = dp2[i] || (i+2 < n && dp3[i] && !(ch[i-3]==ch[i] && ch[i-2] == ch[i+1] && ch[i-1] == ch[i+2]));    }   /*for (int i = n-4; i >= 5; i--) {   //	s2 = ;   	//s3 = ;      dp2[i] = dp3[i+2] || (i+3 < n && dp2[i+2] && !(ch[i]==ch[i+2] && ch[i+1] == ch[i+3]));      dp3[i] = dp2[i+3] || (i+5 < n && dp3[i+3] && !(ch[i]==ch[i+3] && ch[i+1] == ch[i+4] && ch[i+2] == ch[i+5]));   }*/   		for (int i = 5; i < n ;i++ ) {			if (dp2[i]) {				ans.add("" + ch[i]+ch[i+1]);			}			if (dp3[i]) {				ans.add(""+ch[i]+ch[i+1]+ch[i+2]);			}		}		//Collections.sort(ans);		System.out.println(""+ans.size());		for (String s: ans) {			System.out.println(s);		}	}}
