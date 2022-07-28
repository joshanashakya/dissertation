//Team 9 : Rahul Dani, Luan Tran, John Coonimport java.util.ArrayList;import java.util.Scanner; public class Main {     public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int n = sc.nextInt(); //Get number of nodes        int m = sc.nextInt(); //Get number of edges        ArrayList<ArrayList<Integer>> graph = new ArrayList<>(); //Create Arraylist of Arraylist to get a adjacency list        for(int i = 1; i <= n; i++){            graph.add(new ArrayList<Integer>()); //Initialize with empty Arraylists        }        for(int i = 0; i < m; i++){            int start = sc.nextInt(); //Take first node            int end = sc.nextInt(); //Take second node            graph.get(start-1).add(end-1); //Add second node to the list of the first's neighbors            graph.get(end-1).add(start-1); //Add first node to the list of the second's neighbors        }         int[] sizeCount = new int[n]; //Initialize an array to get the counts of each node's edges        for(int i = 0; i < n; i++){            int count = graph.get(i).size(); //Get the number of edges            sizeCount[count] = sizeCount[count] + 1; //Increment and store the total count for each size        }        if(sizeCount[2] == n - 2 && sizeCount[1] == 2) System.out.println("bus topology"); //In bus, the first and last nodes have 1 edge. All remaining nodes have 2 edges.        else if (sizeCount[2] == n) System.out.println("ring topology"); //In ring, all nodes have 2 edges.        else if (sizeCount[n-1] == 1 && sizeCount[1] == n-1) System.out.println("star topology"); //In star, 1 node has n-1 edges and the remaining nodes have 1 edge.        else System.out.println("unknown topology"); //If all other conditions fail, it is an unknown topology.    }} 			 		 	 		  	 	 	   		  	   	