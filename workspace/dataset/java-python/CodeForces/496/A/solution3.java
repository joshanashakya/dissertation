import java.util.ArrayList;import java.util.Scanner; public class Main { 	public static void main(String[] args) {		Scanner input = new Scanner(System.in);				int n = input.nextInt();		ArrayList<Integer> a = new ArrayList<>();				for (int i = 0; i < n; i++)			a.add(input.nextInt());				int[] array = new int [n - 2];				for (int i = 1; i < n - 1; i++) {			ArrayList<Integer> temp = new ArrayList<>();						for (Integer num: a)				temp.add(num);						 temp.remove(i);			 int max = 0;			 for (int j = 0; j < temp.size() - 1; j++) {				 int dest = temp.get(j + 1) - temp.get(j);				 max = (max <= dest)? dest : max;			 }			 array[i - 1] = max;		}				int min = Integer.MAX_VALUE; 		for (int i = 0; i < array.length; i++)			min = (min >= array[i])? array[i] : min;		System.out.println(min);			} }
