import java.util.ArrayList;import java.util.Collections;import java.util.Comparator;import java.util.Scanner; @SuppressWarnings("unused")public class D { 	      public static void main(String[] args) {		Scanner scan = new Scanner(System.in);		Task t=new Task();		t.solve(scan);		scan.close();	}} class Task{	class Pair {		int speed;		int ram;		int hdd;		int cost;		int index;		public Pair(int speed, int ram, int hdd, int cost,int index) {			this.speed = speed;			this.ram = ram;			this.hdd = hdd;			this.cost = cost;			this.index=index;		}					}	public void solve(Scanner scan) {		int t=scan.nextInt();		ArrayList<Pair> h = new ArrayList<Task.Pair>();		for(int i=0;i<t;i++){			int a=scan.nextInt();			int b=scan.nextInt();			int c=scan.nextInt();			int d=scan.nextInt();			h.add(new Pair(a, b, c, d, i));		}		boolean[] b = new boolean[t];		int max1=Integer.MAX_VALUE;		for(int i=0;i<t;i++) {			for(int j=0;j<t;j++) {				if(i!=j &&h.get(i).speed<h.get(j).speed &&h.get(i).hdd<h.get(j).hdd&&				h.get(i).ram<h.get(j).ram) {					b[i]=true;				}			}		}		for(int i=0;i<t;i++) {			if(!b[i]) {				if(h.get(i).cost<max1) {					max1=h.get(i).cost;				}			}		}		for (Pair c : h) {			if(max1==c.cost) {				System.out.println(c.index+1);			}		}	}		}
