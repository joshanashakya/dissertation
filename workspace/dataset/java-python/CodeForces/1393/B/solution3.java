//package codeForces;

import java.io.*;
import java.util.*;

public class ApplejackAndStorages {
	
	 public static void main (String[] args) throws IOException {
			
			InputStreamReader ir = new  InputStreamReader(System.in);
		        BufferedReader br = new BufferedReader(ir);
		       
		           
		             String[] line1 = br.readLine().split(" ");
		            int n = Integer.parseInt(line1[0]);
		            
		            HashMap<Integer,Integer> planks = new HashMap<>();
		            HashSet<Integer> set = new HashSet<>();
		            String[] line2 = br.readLine().split(" ");
		            for(int i=0;i<n;i++)
		            {
		            	int key = Integer.parseInt(line2[i]);
		            	set.add(key);
		            	if(planks.get(key)==null)
		            	{
		            		planks.put(key, 1);
		            	}
		            	else
		            	{
		            		planks.put(key, planks.get(key)+1);
		            	}
		            }
		         //   System.out.println("Initial Map-"+planks);
		            int q = Integer.parseInt(br.readLine());
		            
		            int p1,p2,sp1,sp2;
		            sp1=sp2=0;
		            
		           /** HashSet<Integer> set = new HashSet<>();
		           // set = (HashSet<Integer>) planks.keySet();
		            System.out.println("Set="+set);
		            
		            Integer[] arr= new Integer[set.size()];
		            
		           arr =  (Integer[]) set.toArray();
		           System.out.println("Array = "+arr.toString());
		           
		           */
		           for(int i: set)
		           {
		        	   int val = planks.get(i);
		        		p1 = val/2;
	            		p2 = p1/2;
	            		p1 = p1- p2*2;
	            		
	            		sp1+=p1;
	            		sp2+=p2;
                     }
		          
		            while(q-->0)
		            {
		            String s = br.readLine();
		            
		            int key = Integer.parseInt(s.substring(2));
		          //  System.out.println("Key for this query ="+key);
		            
		            if(s.charAt(0)=='+')
		            {
		            	if(planks.get(key)==null)
		            	{
		            		planks.put(key, 1);
		            	}
		            	else
		            	{
		            		int val = planks.get(key);
		            		p1 = val/2;
		            		p2 = p1/2;
		            		p1 = p1- p2*2;
		            		
		            		sp1-=p1;
		            		sp2-=p2;
		            		
		            	val++;
	            		p1 = val/2;
	            		p2 = p1/2;
	            		p1 = p1- p2*2;
	            		
	            		sp1+=p1;
	            		sp2+=p2;
	            		
	            		planks.put(key, val);
		            		
		            	}
		            }
		            else
		            {
		            	int val = planks.get(key);
	            		p1 = val/2;
	            		p2 = p1/2;
	            		p1 = p1- p2*2;
	            		
	            		sp1-=p1;
	            		sp2-=p2;
	            		
	            	val--;
            		p1 = val/2;
            		p2 = p1/2;
            		p1 = p1- p2*2;
            		
            		sp1+=p1;
            		sp2+=p2;
            		
            		planks.put(key, val);
		            }
		            
		            if((sp2>0&&sp1>1)||sp2>1)
		            	System.out.println("YES");
		            else
		            	System.out.println("NO");
		            }
	       }

   }

