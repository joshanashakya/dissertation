//package com.company;import java.util.*; import java.util.Scanner; public class Main {    public static void main(String[] args) {        int na = scanner.nextInt();        int nb = scanner.nextInt();        int k  =scanner.nextInt();        int m  =scanner.nextInt();        int[] array = new int[na];        int[] array2 = new int[nb];        readArray(array);readArray(array2);        int max = Integer.MIN_VALUE;        for(int i = 0 ;i<k;i++){            max =Math.max(max,array[i]);        }        boolean flag = true;        for(int j = nb-1;j>=nb-m;j--){            if(array2[j]<=max){                flag = false;            }        }        if(flag) System.out.println("YES");else System.out.println("NO");    }    private static int fibo(int n){        if(n==0){            return 0;        }        if(n==1){            return 1;        }        return fibo(n-1)+fibo(n-2);    }    private static void swap(int[] array , int a,int b){        if(a==b){            return;        }        int temp = array[a];        array[a] = array[b];        array[b] = temp;    }    private static Scanner scanner = new Scanner(System.in);    private static int max(int[] array ){        int min = Integer.MIN_VALUE;        for(int i = 0;i< array.length;i++){            if(array[i]>min){                min = array[i];            }        }        return min;    }    private static int min(int[] array ){        int min = Integer.MAX_VALUE;        for(int i = 0;i< array.length;i++){            if(array[i]<min){                min = array[i];            }        }        return min;    }    private static void readArray(int[] array){        for(int i = 0;i< array.length;i++){            array[i] = scanner.nextInt();        }    }    private static void printarray(int[] array){        for(int i = 0; i< array.length;i++){            System.out.print(array[i]);        }    }    private static int gcd(int a , int b){       if(b==0) return  a;       else return gcd(b,a%b);    }    private static long fact(int n){        if(n==1) return 1;        else return (long) n*fact(n-1);    }    private static int Arraysum(int[] array){        int sum = 0;        for(int i = 0 ;i< array.length;i++){            sum+=array[i];        }        return sum;    }    private static boolean isPrime(long n){        if(n==1){            return false;        }        for(long i = 2;i<=Math.sqrt(n);i++){            if(n%i==0){                return false;            }        }        return true;    }    private static int multiply(int[] array){        int mult = 1 ;        for(int i = 0 ;i< array.length;i++) {            mult *= array[i];        }        return mult;    }}