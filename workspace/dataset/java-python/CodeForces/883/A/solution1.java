import java.util.Scanner; public class Problem2{	        public static void main(String[] args)    {                Scanner scanner = new Scanner(System.in);                String input1 = scanner.nextLine();        String input2 = scanner.nextLine();                String[] split1 = input1.split(" ");        String[] split2 = input2.split(" ");        long[] tms = new long[split2.length];        for (int i = 0; i < split2.length; i++)        {            tms[i] = Long.valueOf(split2[i]);        }                long n = Long.valueOf(split1[0]);        long m = Long.valueOf(split1[1]);        long a = Long.valueOf(split1[2]);        long d = Long.valueOf(split1[3]);                long openCount = 0;        long tc = 0;        long breaks = d / a + (long)1;        for (int i = 0; i < tms.length; i++)        {            long ta = tms[i] / a;            if (tms[i] > tc && ta <= n)            {                long tx = tms[i] - tms[i] % a;                long ty = a * (tc / a + (long)1);                if (ty <= tx)                {                    long az = (tx - ty) / (a * breaks);                    openCount += az + 1;                    long ty1 = ty + (az * a * breaks);                    if (tms[i] - ty1 > d)                    {                        tc = tms[i] + d;                        openCount++;                    }                    else                    {                        tc = ty1 + d;                    }                }                else                {                    tc = tms[i] + d;                    openCount++;                }            }            else if (tms[i] > tc && ta > n)            {                if (tc == 0)                {                    long tx = n * a;                    long ty = a * (tc / a + (long)1);                    if (ty <= tx)                    {                        long az = (tx - ty) / (a * breaks);                        openCount += az + (long)1;                        long ty1 = ty + (az * a * breaks);                        tc =  ty1 + d;                    }                }                else                {                    openCount++;                    tc = tms[i] + d;                }            }        }                if (tc < n * a)        {            long tx = n * a;            long ty = a * (tc / a + (long)1);            if (ty <= tx)            {                long az = (tx - ty) / (a * breaks);                openCount += az + (long)1;            }        }                System.out.println(openCount);            }}