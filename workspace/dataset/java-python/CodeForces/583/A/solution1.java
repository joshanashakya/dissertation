import java.util.*; public class T1 {    public static void main(String[] args) {        Scanner sc=new Scanner(System.in);        int n=sc.nextInt();        sc.nextLine();        Set<Integer> setx=new HashSet<>();        Set<Integer> sety=new HashSet<>();        List<Integer> list=new ArrayList<>();        for (int i = 0; i < n*n; i++) {            int x=sc.nextInt();            int y=sc.nextInt();            if(setx.add(x)){                if(sety.add(y)){                    list.add(i+1);                }else {                    setx.remove(x);                }            }            sc.nextLine();        }        for (int a:list){            System.out.println(a);        }    }}    	   			 			   		  	 		 	