    import java.util.*;    public class Solution{            public static void main(String[] args){        Scanner s=new Scanner(System.in);        int n=s.nextInt();        String a[]=new String[n];        ArrayList<Integer> b=new ArrayList<>();        s.nextLine();int count=0;         String[] color={"blue","green","orange","purple","red","yellow"};         String[] gems={"Space","Time","Soul","Power","Reality","Mind"};        for(int i=0;i<n;i++){            a[i]=s.nextLine();        }                for(int i=0;i<color.length;i++){                        boolean v=check(color[i],a);            if(v==true){                count++;                b.add(i);                        }        }        System.out.println(count);        for(int a2:b){            System.out.println(gems[a2]);        }                            }    public static boolean check(String s1,String[] a){        for(int k=0;k<a.length;k++){            if(s1.equals(a[k]))                return false;        }        return true;    }    }    
