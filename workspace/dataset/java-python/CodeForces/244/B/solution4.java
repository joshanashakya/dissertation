import java.util.*;public class T9 {    public static void main(String[] args) {        Scanner sc=new Scanner(System.in);        int max=sc.nextInt();        Set<Long> set=new HashSet<>();        for (int i = 0; i < 10; i++) {            for (int j = i+1; j < 10; j++) {                dfs(max,i,j,0,set);            }        }        System.out.println(set.size());     }    public static void dfs(int max,int n1,int n2,long t,Set<Long> set){        if(t>max){            return;        }        if(t>0){            set.add(t);        }        if(t!=0 || n1!=0){            dfs(max,n1,n2,t*10+n1,set);        }        if(t!=0 || n2!=0){            dfs(max,n2,n1,t*10+n2,set);        }    }}
