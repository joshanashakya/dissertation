import java.util.ArrayList;import java.util.Arrays;import java.util.Collections;import java.util.Comparator;import java.util.HashMap;import java.util.Map.Entry;import java.util.Scanner;import java.util.Set; @SuppressWarnings("unused")public class D { 	      public static void main(String[] args) {		Scanner scan = new Scanner(System.in);		Task t=new Task();		t.solve(scan);		scan.close();	}} class Task{	class Pair {		int time;		char team;		int num;		char card;		String name;		public Pair(int time, char team, int num, char card) {			this.time = time;			this.team = team;			this.num = num;			this.card = card;		}		public Pair(String name, int num,int time) {			super();			this.name = name;			this.num = num;			this.time = time;		}							}	@SuppressWarnings("unused")	public void solve(Scanner scan) {		String s=scan.next();		String t=scan.next();		int n=scan.nextInt();		ArrayList<Pair> a= new ArrayList<Task.Pair>();		for(int i=0;i<n;i++) {			int x=scan.nextInt();			char c1=scan.next().charAt(0);			int y=scan.nextInt();			char c2=scan.next().charAt(0);			a.add(new Pair(x, c1,y,c2));		}		int[] h= new int[100];		Arrays.fill(h, 0);		int[] aw= new int[100];		Arrays.fill(aw, 0);		ArrayList<Pair> a1= new ArrayList<Task.Pair>();		for (Pair p : a) {			if(p.team=='a') {				if( p.card=='r' && aw[p.num]<2) {					aw[p.num]+=2;					a1.add(new Pair(t,p.num , p.time));				}				else if(p.card=='y'&& aw[p.num]<2) {					aw[p.num]++;					if(aw[p.num]>=2) {						a1.add(new Pair(t, p.num, p.time));					}									}			}			else {				if( p.card=='r'  && h[p.num]<2) {					h[p.num]+=2;					a1.add(new Pair(s, p.num, p.time));				}				else if(p.card=='y' &&h[p.num]<2) {					h[p.num]++;					if(h[p.num]>=2) {						a1.add(new Pair(s, p.num, p.time));					}				}			}		}		for (Pair p : a1) {			System.out.println(p.name+" "+p.num+" "+p.time);		}	}}