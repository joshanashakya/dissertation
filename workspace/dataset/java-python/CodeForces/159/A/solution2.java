    import java.util.*;    public class Problem {    	public static void main(String[] args) {    		Scanner sc = new Scanner(System.in);    		int n = sc.nextInt();    		int d = sc.nextInt();    		    		String[] from = new String[n];    		String[] to = new String[n];    		int[] time = new int[n];    		    		for (int i=0; i<n; i++) {    			from[i] = sc.next();    			to[i] = sc.next();    			time[i] = sc.nextInt();    		}    		    		HashSet<String> ans = new HashSet<String>();    		for (int i=0; i<n; i++) {    			for (int j=i+1; j<n; j++) {    				if (from[i].equals(to[j]) && to[i].equals(from[j]) && time[j]-time[i]<=d && time[j]-time[i]>0) {    					ans.add(fixStr(from[i],to[i]));    				}    			}    		}    		    		System.out.println(ans.size());    		for (String s : ans) {    			System.out.println(s);    		}    	}    	    	private static String fixStr(String a, String b) {    		if (a.compareTo(b) > 0) {    			return b+" "+a;    		} else {    			return a+" "+b;    		}    	}    }
