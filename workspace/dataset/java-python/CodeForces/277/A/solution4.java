import java.io.*;import java.util.*; public class TWO77A {    private int adj[][];    private boolean visited[];    private int n, m;    private boolean allNone = true;        public static void main(String args[])    {        TWO77A t = new TWO77A();        t.process();    }        public void process()    {        Scanner s = new Scanner(System.in);        n = s.nextInt();        m = s.nextInt();        adj = new int[n][n];        ArrayList<Employee> employees = new ArrayList<Employee>();        visited = new boolean[n];        Arrays.fill(visited, false);                for (int i = 0; i < n; i++)        {            for (int j = 0; j < n; j++)            {                adj[i][j] = 0;            }        }                for (int i = 0; i < n; i++)        {            int numLanguage = s.nextInt();            if (numLanguage != 0)            {                allNone = false;            }            Employee e = new Employee();            for (int j = 0; j < numLanguage; j++)            {                e.languages.add(s.nextInt());            }            employees.add(e);        }                for (int emp1 = 0; emp1 < n; emp1++)        {            for (int emp2 = emp1 + 1; emp2 < n; emp2++)            {                Employee e1 = employees.get(emp1);                Employee e2 = employees.get(emp2);                for (int lang : e2.languages)                {                    if (e1.languages.contains(lang))                    {                        adj[emp1][emp2] = adj[emp2][emp1] = 1;                    }                }            }        }        //        for (int i = 0; i < n; i++)//        {//            for (int j = 0; j < n; j++)//            {//                System.out.print(adj[i][j] + " ");//            }//            System.out.println();//        }                int ans = 0;        for (int i = 0; i < n; i++)        {            if (!visited[i])            {                dfs(i);                ans++;            }        }                if (!allNone)        {            System.out.println(ans - 1);        }        else        {            System.out.println(n);        }    }        public void dfs(int cur)    {        visited[cur] = true;        for (int i = 0; i < n; i++)        {            if (!visited[i] && adj[cur][i] == 1)            {                dfs(i);            }        }    } } class Employee{    public ArrayList<Integer> languages;        public Employee()    {        languages = new ArrayList<Integer>();    }}