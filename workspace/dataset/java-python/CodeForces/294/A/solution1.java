import java.util.*;import java.io.*; public class Main{	public static void main(String[] args) {				Scanner sc= new Scanner(System.in);				int x=sc.nextInt();		int arr[] = new int[x];		for(int i=0;i<x;i++) {			arr[i]=sc.nextInt();		}				int n=sc.nextInt();				while(n-->0) {			int wire=sc.nextInt();			int bird=sc.nextInt();			if(wire!=1) {				arr[wire-2]+=bird-1;			}			if(wire!=arr.length) {				arr[wire]+=(arr[wire-1]-bird);			}			arr[wire-1]=0;		}				for(int i=0;i<arr.length;i++) {			System.out.println(arr[i]);		}	}}
