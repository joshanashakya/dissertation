import java.util. *;import java.io. *;import static

java.lang.Math. *; public


class PracticeProblem{/ * * This FastReader code is taken from GeeksForGeeks.com * https://


    www.geeksforgeeks.org / fast - io - in -java - in -competitive - programming / * * The
article
was
written
by
Rishabh
Mahrsee * / public
static


class FastReader    {BufferedReader br;        StringTokenizer st;         public FastReader()        {br = new BufferedReader(new InputStreamReader(System.in ));}         String next()        {


while (st == null | | !st.hasMoreElements())            {
try                {st = new StringTokenizer(br.readLine());}                catch (IOException  e)                {e.printStackTrace();}}
return st.nextToken();}         int
nextInt()
{
return Integer.parseInt(next());}         long
nextLong()
{
return Long.parseLong(next());}         double
nextDouble()
{
return Double.parseDouble(next());}         String
nextLine()
{String
str = "";            try            {str = br.readLine();}            catch(IOException
e)            {e.printStackTrace();}            return str;}}     public
static
FastReader in = new
FastReader();
public
static
PrintWriter
out = new
PrintWriter(System.out);     public
static
void
main(String[]
args)    {solve();
out.close();}     private
static
void
solve()
{Map < String, Integer > nameMapping = new
HashMap <> ();
nameMapping.put("Anka", 0);
nameMapping.put("Chapay", 1);
nameMapping.put("Cleo", 2);
nameMapping.put("Troll", 3);
nameMapping.put("Dracul", 4);
nameMapping.put("Snowy", 5);
nameMapping.put("Hexadecimal", 6);         int
n = in.nextInt();
List < Integer > []
graph = new
List[7]; for (int i = 0; i < 7; i++)
graph[i] = new
ArrayList <> ();         for (int i = 0; i < n; i++)        {
    StringTokenizer line = new StringTokenizer( in.nextLine());             int a = nameMapping.get(line.nextToken());            line.nextToken();            int b = nameMapping.get(line.nextToken());             graph[a].add(b);}         int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();  // These are the only 4 possible team sizes        int[] maxLikes = {maxLikes(graph, 1, 1, 5), maxLikes(graph, 1, 2, 4), maxLikes(graph, 1, 3, 3), maxLikes(graph, 2, 2, 3)};        int minDist = Integer.MAX_VALUE;        int totalLike = -1; for (int i = 1; i <= 5; i++)        {for (int j = 1; j <= 6 - i; j++)            {int k = 7 - (i + j);                int dist = max(a / i, max(b / j, c / k)) - min(a / i, min(b / j, c / k));                int ma = max(i, max(j, k));                int mi = min(i, min(j, k)); if (dist < minDist)                {minDist = dist;  if (ma == 5)                        totalLike = maxLikes[0]; else if (ma == 4)                        totalLike = maxLikes[1]; else if (mi == 1)                        totalLike = maxLikes[2]; else totalLike = maxLikes[3];} else if (dist == minDist)                {if (ma == 5)                        totalLike = max(totalLike, maxLikes[0]); else if (ma == 4)                        totalLike = max(totalLike, maxLikes[1]); else if (mi == 1)                        totalLike = max(totalLike, maxLikes[2]); else totalLike = max(totalLike, maxLikes[3]);}}}         out.println(minDist + " " + totalLike);}     private static int maxLikes(List < Integer >[] graph, int a, int b, int c)    {int[] first = new int[a];        int[] second = new int[b];         first[0] = 0; for (int i = 1; i < a; i++)            first[i] = first[i - 1] + 1;         int max = -1;
while (true)        {second[0] = 0;
while (contains(first, second[0])) second[0]++; for (int i = 1; i < b; i++)            {second[i] = second[i - 1] + 1;
while (contains(first, second[i])) second[i]++;}
while (
true)            {max = max(max, countLikes(graph, first, second));                int ii;                boolean finished = true; for (ii = second.length - 1; ii >= 0; ii--)                {second[ii]++;
while (contains(first, second[
    ii])) second[ii]++;  if (second[ii] < 7 - (second.length - 1 - ii))                    {finished = false;
break;}}                if (finished)
    break;                 for (ii + +; ii < second.length; ii++)                {second[ii] = second[ii - 1] + 1;
while (contains(first, second[ii])) second[ii]++; if (second[ii] >= 7)                    {finished = true;
break;}}                if (finished)
    break;}            int
i;
boolean
finished = true; for (i = first.length - 1; i >= 0; i--)
{first[i] + +; if (first[i] < 7)
{finished = false;
break;}}            if (finished)
    break;             for (i + +; i < first.length; i++)            {
    first[i] = first[i - 1] + 1; if (first[i] >= 7)                {finished = true;
break;}}            if (finished)
    break;}        return max;}     private
static
int
countLikes(List < Integer > []
graph, int[]
first, int[]
second)    {Set < Integer > third = new
HashSet <> (Arrays.asList(0, 1, 2, 3, 4, 5, 6)); for (int i: first)
third.remove(i); for (int i: second)
third.remove(i);         int
count = 0;         for (int i: first)            for (int j: graph[i])                if (
contains(first, j))                    count++;  for (int i: second)            for (int j: graph[i]) if (
contains(second, j))                    count + +;  for (int i: third)            for (int j: graph[i]) if (
third.contains(
    j))                    count + +;  return count;}     public static boolean contains(int[] arr, int x)    {for (int i: arr)            if (
        i == x)                return true; return false;}}
