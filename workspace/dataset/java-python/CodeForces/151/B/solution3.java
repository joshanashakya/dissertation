import java.util.*;public class PhoneNumbers {    static class Phonebook{        int size;        String name;        ArrayList<String>al=new ArrayList<>();        Phonebook(int size, String name){            this.size=size;            this.name=name;        }        void addNumber(String s){            String p="";            for(int i=0;i<s.length();i++){                if(s.charAt(i)!='-')                    p+=s.charAt(i);            }            al.add(p);        }        String getName(){            return this.name;        }    }    static int check(String s){        for(int i=1;i<s.length();i++){            if(s.charAt(i)!=s.charAt(i-1))                break;            if(i==s.length()-1)                return 0;        }        for(int i=1;i<s.length();i++){            if(s.charAt(i)>=s.charAt(i-1))                break;            if(i==s.length()-1)                return 1;        }        return 2;    }        public static void main(String args[]){        Scanner sc= new Scanner(System.in);        int n=sc.nextInt();        Phonebook a[]=new Phonebook[n];        int tpg[][]=new int[n][3],var;        for(int i=0; i<n;i++){            int size=sc.nextInt();            String name=sc.next();            a[i]=new Phonebook(size,name);            for(int j=0;j<size;j++){                String g=sc.next();                a[i].addNumber(g);                var=check(a[i].al.get(a[i].al.size()-1));                tpg[i][var]++;            }        }                ArrayList<ArrayList<String>>al=new ArrayList<>(3);        for(int i=0;i<3;i++)            al.add(new ArrayList<>());                for(int i=0;i<3;i++){            int max=Integer.MIN_VALUE;            for(int j=0;j<n;j++){                if(tpg[j][i]>max){                    max=tpg[j][i];                    al.get(i).removeAll(al.get(i));                    al.get(i).add(a[j].getName());                }                else if(tpg[j][i]==max)                    al.get(i).add(a[j].getName());            }        }        System.out.print("If you want to call a taxi, you should call: ");        System.out.print(al.get(0).get(0));        for(int i=1;i<al.get(0).size();i++)           System.out.print(", "+al.get(0).get(i));        System.out.println(".");                System.out.print("If you want to order a pizza, you should call: ");        System.out.print(al.get(1).get(0));        for(int i=1;i<al.get(1).size();i++)           System.out.print(", "+al.get(1).get(i));        System.out.println(".");                System.out.print("If you want to go to a cafe with a wonderful girl, you should call: ");        System.out.print(al.get(2).get(0));        for(int i=1;i<al.get(2).size();i++)           System.out.print(", "+al.get(2).get(i));        System.out.println(".");    }}
