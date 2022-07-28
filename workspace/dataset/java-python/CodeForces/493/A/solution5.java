import java.util.ArrayList;import java.util.Arrays;import java.util.Collections;import java.util.Comparator;import java.util.HashMap;import java.util.Map.Entry;import java.util.Scanner;import java.util.Set; @SuppressWarnings("unused")public class D { 	      public static void main(String[] args) {		Scanner scan = new Scanner(System.in);		Task t=new Task();		t.solve(scan);		scan.close();	}} class Task{	class Pair {		int time;		char team;		int num;		char card;		String name;		public Pair(int time, char team, int num, char card) {			this.time = time;			this.team = team;			this.num = num;			this.card = card;		}		public Pair(String name, int num,int time) {			super();			this.name = name;			this.num = num;			this.time = time;		}							}	@SuppressWarnings("unused")	public void solve(Scanner scan) {		String home=scan.next();		String away=scan.next();		int n=scan.nextInt();		int[] h= new int[100];		int[] aw= new int[100];		Arrays.fill(h, 0);		Arrays.fill(aw, 0);		ArrayList<Pair> a= new ArrayList<Task.Pair>();		for(int i=0;i<n;i++) {			int time=scan.nextInt();			char team=scan.next().charAt(0);			int num=scan.nextInt();			char col=scan.next().charAt(0);			if(team=='h') {				if(col=='r'&& h[num]<2) {					h[num]+=2;					a.add(new Pair(home, num, time));				}				else if(col=='y' && h[num]<2) {					h[num]++;					if(h[num]>=2) {						a.add(new Pair(home, num, time));					}									}			}			else {				if(col=='r'&& aw[num]<2) {					aw[num]+=2;					a.add(new Pair(away, num, time));				}				else if(col=='y' && aw[num]<2) {					aw[num]++;					if(aw[num]>=2) {						a.add(new Pair(away, num, time));					}									}			}		}		//System.out.println(Arrays.toString(h));		for (Pair p : a) {			System.out.println(p.name+" "+p.num+" "+p.time);		}	}}
