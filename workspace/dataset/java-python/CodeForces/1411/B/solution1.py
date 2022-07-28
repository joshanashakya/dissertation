import java.util. *;public


class FairNumber {public static int check(long n)    {long x=n;


while (x != 0)        {if (x % 10 != 0 & & n % (x % 10) != 0)
return -1;
x /= 10;}        return 1;}     public
static
void
main(String[]
args) { // TODO
Auto - generated
method
stub
Scanner
sc = new
Scanner(System. in);
int
t = sc.nextInt(); while (t -->0)
{long
n = sc.nextLong();
while (true)            {if (check(n) == 1)                {System.out.println(n);
break;} else n + +;}}} }
