import java.util.*;import java.lang.Math;    public class test4 {      public static void main(String[] args) {          Scanner s=new Scanner(System.in);          int r= s.nextInt();          int g= s.nextInt();          int b= s.nextInt();          int t=29;          int check=0;          while(check==0){            if(r<=0 && g<=0 && b<=0){              check=1;            }            if(check==0){              r-=2;              t++;            }            if(r<=0 && g<=0 && b<=0){              check=1;            }            if(check==0){              g-=2;              t++;            }            if(r<=0 && g<=0 && b<=0){              check=1;            }            if(check==0){              b-=2;              t++;            }          }          System.out.println(t);    }   }