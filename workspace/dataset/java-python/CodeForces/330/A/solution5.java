import java.io.*;import java.lang.*;import java.util.ArrayList; public class _temp2 {	public static void main(String[] args)  throws NumberFormatException, IOException {		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		String[] st = br.readLine().split(" ");		int n = Integer.parseInt(st[0]);		int m = Integer.parseInt(st[1]);		ArrayList<Integer> row = new ArrayList<>();		ArrayList<Integer> col = new ArrayList<>();		for(int i=0;i<n;i++){			row.add(i);		}		for(int i=0;i<m;i++){			col.add(i);		}		for(int i=0;i<n;i++){			st = br.readLine().split("");			for(int j=0;j<m;j++){				if(st[j].equals("S")){					row.remove(new Integer(i));					col.remove(new Integer(j));				}			}		}		System.out.println((n*m)-(n-row.size())*(m-col.size()));	}}
