import java.lang.*;import java.util.*;import java.util.stream.Collectors;import java.io.*; public class absolute {	public static class pair{		int count;		int ppl;		public pair(int count, int ppl)		{			this.count=count;			this.ppl=ppl;		}	}	public static void printlist(List<pair> list ) {		System.out.println("Call");		for(pair p : list)System.out.println(p.count+" "+p.ppl);	}	public static void main(String[] args) {				Scanner sc = new Scanner(System.in);		int n =sc.nextInt();		int k = sc.nextInt();		Map<Integer,Integer> map = new TreeMap<Integer,Integer>();		for(int i=0;i<k;i++)		{			int key = sc.nextInt();			if(map.containsKey(key))map.replace(key, map.get(key)+1);			else map.put(key, 1);		}		Map<Integer, Integer> sorted = map.entrySet().stream()                .sorted(Map.Entry.comparingByValue())                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,                 (oldValue, newValue) -> oldValue, LinkedHashMap::new));		List<Integer> keys = new ArrayList<Integer>(sorted.keySet());		Collections.reverse(keys);		List<pair> list = new ArrayList<pair>();		for(int key : keys)		{			list.add(new pair(sorted.get(key),1));		}				int max=0,end=n-1;		while(end>=0)		{			//printlist(list);			//System.out.println("End "+end);			if(list.size()>end) {				max = Math.max(max, list.get(end).count/list.get(end).ppl);			}			pair maxpair = list.get(0);list.remove(0);			maxpair.ppl = maxpair.ppl+1;			int less=0;			while(less<list.size() && (  list.get(less).count/list.get(less).ppl  >  maxpair.count/maxpair.ppl))less++;			list.add(less,maxpair);			end--;					}				System.out.println(max);	}	}