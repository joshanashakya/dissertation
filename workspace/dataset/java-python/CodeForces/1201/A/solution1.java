import java.util.*;public class important_exam{    public static void main(String args[])    {        Scanner sc = new Scanner(System.in);        int n = sc.nextInt();        int m = sc.nextInt();        int A[] = new int[m];        String S[] = new String[n];        sc.nextLine();        for(int i = 0; i<n ; i++)        {            S[i] = sc.nextLine();        }        for(int i = 0; i< m; i++)        {            A[i] = sc.nextInt();        }        int score = 0;        for(int i = 0; i< m; i++)        {            int frequency = 0;            int acount = 0, bcount = 0, ccount = 0, dcount = 0, ecount = 0;            for(int j = 0; j< n;j++)            {                char ch = S[j].charAt(i);                                switch(ch)                {                    case 'A':                        acount++;                        break;                    case 'B':                        bcount++;                        break;                    case 'C':                        ccount++;                        break;                    case 'D':                        dcount++;                        break;                    case 'E':                        ecount++;                        break;                    default :                         frequency =0;                }                           }            frequency = Math.max(acount,Math.max(bcount,Math.max(ccount,Math.max(dcount,ecount))));            score += A[i]*frequency;        }        System.out.println(score);    }}
