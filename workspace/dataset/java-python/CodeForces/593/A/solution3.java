import java.util.*;  public class BruteForce {     public static Scanner in =new Scanner(System.in);    public static boolean check(String txt){        HashSet<Integer> set=new HashSet<Integer>();        for(int i=0;i<txt.length();i++)            set.add((int)txt.charAt(i));        if(set.size()>2)            return false;        else            return true;    }    public static long getCost(ArrayList<String>list,char a,char b){        long cost=0;        if(a==b){            for(int i=0;i<list.size();i++){                int count=0;                String cur=list.get(i);                for(int j=0;j<cur.length();j++){                    if(cur.charAt(j)==a)                        count++;                    else{                        count=0;                        break;                    }                }                cost+=count;            }        }        else{            for(int i=0;i<list.size();i++){                int count=0;            String cur=list.get(i);            for(int j=0;j<cur.length();j++){                if(cur.charAt(j)==a||cur.charAt(j)==b)                    count++;                else{                    count=0;                    break;                }            }            cost+=count;        }        }        return cost;    }    public static void main(String[] args) {        int n=in.nextInt();        ArrayList<String>list=new ArrayList<String>();        for(int i=0;i<n;i++){            String cur=in.next();            if(check(cur))                list.add(cur);        }        long max=0;        for(char i='a';i<='z';i++){            for(char j='a';j<='z';j++){                long cur=getCost(list,i,j);                max=Math.max(cur,max);            }        }               System.out.println(max);    }    }