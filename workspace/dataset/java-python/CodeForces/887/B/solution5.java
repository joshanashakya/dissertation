import java.io.*;import java.util.*;import java.util.regex.*;public class vk18{    public static void main(String[]stp) throws Exception    {    	Scanner scan=new Scanner(System.in);        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        //String []s;        int n=scan.nextInt(),i,a,b,j,k;        HashMap<Integer,ArrayList<Integer>> hm=new HashMap<>();        for(i=0;i<10;i++) { ArrayList<Integer> al=new ArrayList<>(); hm.put(i,al); }        for(i=0;i<n;i++)        {        	for(j=0;j<6;j++) { k=scan.nextInt(); hm.get(k).add(i); }        }    	int count=0;    	for(i=1;i<99;i++)    	{    		if(i<=9) { if(hm.get(i).size()>0) count++; else break;}    		else    		{    			a=i%10;b=i/10;    			if(a==b)     				{     					if(hm.get(a).size()>=2)     						{    							HashSet<Integer> hs1=new HashSet<>(hm.get(a));    							if(hs1.size()==1) break;    							else count++;}     					else break;     				}    			else if(hm.get(a).size()==0 || hm.get(b).size()==0) break;    			else if(hm.get(a).size()==1 && hm.get(b).size()==1)    			{    				if(hm.get(a).get(0)==hm.get(b).get(0)) break;    				else count++;    			}     			else    			{    				HashSet<Integer> hs1=new HashSet<>(hm.get(a));    				HashSet<Integer> hs2=new HashSet<>(hm.get(b));    				if(hs1.size() > 1 || hs2.size()>1) count++;    				else if(hs1.iterator().next() == hs2.iterator().next()) break;    				else count++;    			}    		}    	}    	System.out.println(count);     }}