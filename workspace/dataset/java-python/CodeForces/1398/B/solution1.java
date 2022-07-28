

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class SubstringRemovalGame {

   
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
         
        int num = scan.nextInt();
        ArrayList <String> cases = new ArrayList();
        ArrayList <String> ones=new ArrayList();
        ArrayList <Integer> score = new ArrayList();
        
        int alice =0;
        int gameCounter=0;
        String one="";
        
        for(int i=0;i<num;i++)
            cases.add(scan.next());
        
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<cases.get(i).length();j++)
            {
                if (cases.get(i).charAt(j)=='1')
                {
                    one = one.concat("1");
                    if(!one.equals("")&&j==cases.get(i).length()-1)
                        ones.add(one);
                }
                else
                {
                    if(!one.equals(""))
                        ones.add(one);
                    one="";
                }
            }
            while(!ones.isEmpty())
            {
            if(gameCounter%2==0)
            {
                alice+=Collections.max(ones).length();
               
            }
            
            gameCounter++;
            ones.remove(ones.indexOf((Collections.max(ones))));
            
            }
            score.add(alice);
            alice =0;
            ones.clear();
            one="";
            gameCounter=0;
           
            
           
        }
        for(int i=0;i<score.size();i++)
            System.out.println(score.get(i));
        
        
    }
    
    
    
}
/*
 ArrayList<Character> temp = new ArrayList() ;
        for(int i=0;i<num;i++)
        {
            cases.get(i);
            for(int j=0;j<cases.get(i).length();j++)
            {
                if (cases.get(i).charAt(j)=='1')
                {
                    count++;
                    if(count>max)
                    {
                        max=count;
                        index=j;
                    }
                }
                else
                    count=0;
                
                if(gameCounter%2==0)
                alice+=max;
            
                if(index>max)
            
                {
                    first=cases.get(i).substring(0,index-max);
                    last = cases.get(i).substring(index,cases.get(i).length()-1);
                    concated=concated.concat(first);
                    concated=concated.concat(last);
                    
                    cases.remove(i);
                    cases.add(i,concated);
                    
                    

                }
                else
                    break;
                        
        }
           
        
*/

