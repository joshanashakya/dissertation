import java.util.*;public class Solution{    public static void main(String[] args)    {        Scanner sc = new Scanner(System.in);        int n = sc.nextInt();        HashMap<String,Integer> hm = new HashMap<String,Integer>();        hm.put("Tetrahedron",4);        hm.put("Cube",6);        hm.put("Octahedron",8);        hm.put("Dodecahedron",12);        hm.put("Icosahedron",20);        String str;        int sum = 0;        for(int i=0;i<n;i++)        {            str = sc.next();            sum = sum+hm.get(str);        }        System.out.println(sum);     }}