import java.util.*;  public class l700 { 	public static void main(String[] args) {		// TODO Auto-generated method stub		Scanner sc = new Scanner(System.in);		int n = sc.nextInt();		HashMap<String,String> gauntlet = new HashMap<>();		HashMap<String,String> color = new HashMap<>(); 		gauntlet.put("purple", "Power");		gauntlet.put("green", "Time");		gauntlet.put("blue", "Space");		gauntlet.put("orange", "Soul");		gauntlet.put("red", "Reality");		gauntlet.put("yellow", "Mind");				//String[] color = new String[n];		for(int i = 0;i<n;i++)		{			color.put(sc.next(), null);					}		System.out.println(6-n);		for(String i:gauntlet.keySet())		{			if(color.containsKey(i) == true)				continue;			else				System.out.println(gauntlet.get(i));		}		} }
