//package com.company; import java.util.*;import java.lang.*;import java.io.*; public class Main {     public static void main(String[] args)throws Exception {        Scanner sx = new Scanner(System.in);        int n = sx.nextInt();        ArrayList<Long> id = new ArrayList<Long>();        for(int i=0;i<n;i++){            id.add(sx.nextLong());        }        int d=1,c=0;        Collections.sort(id);        for(int i=0;i<n-1;i++){            if(id.get(i)!=0){                if(id.get(i).equals(id.get(i + 1))){                    if(i!=n-2){                        if(id.get(i + 1).equals(id.get(i + 2))){                            d=0;                            System.out.println(-1);                            break;                        }                    }                    c++;                }            }        }        if(d!=0){            System.out.println(c);        }    }}
