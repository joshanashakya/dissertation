/* * To change this license header, choose License Headers in Project Properties. * To change this template file, choose Tools | Templates * and open the template in the editor. */  import java.util.Arrays;import java.util.HashSet;import java.util.Scanner;import java.util.Set; /** * * @author sliman */public class Javaweb {     /**     * @param args the command line arguments     */    public static void main(String[] args) {        // TODO code application logic here             int n;        Scanner cin=new Scanner(System.in);        n=cin.nextInt();        int a[]=new int[n];        Set<Integer>s=new HashSet<>();        for(int i=0;i<n;i++){            a[i]=cin.nextInt();        }                Arrays.sort(a);        for(int i=n-1;i>-1;i--){            int x=a[i];                     if(s.contains(x)==false){                s.add(x);                continue;                            }            while(x>0){                --x;                if(s.contains(x)==false){                    s.add(x);                    break;                }            }                   }             long ans=0;        for(Integer i:s)ans+=i;        System.out.println(ans);    }  }
