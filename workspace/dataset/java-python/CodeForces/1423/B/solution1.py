from sys import stdin, stdoutfrom

collections
import dequeimport

sys graph = []
n = 0
current_graph = []
pair_f = []
pair_a = []
dist = []  

def dfs(s):    global pair_f


global pair_a
global dist     if s != 0:        for
a in current_graph[s]:
if dist[pair_a[a]] == (dist[s] + 1):                if
dfs(pair_a[a]): pair_a[a] = s
pair_f[s] = a
return True         dist[s] = 10 ** 4 + 1
return False     return True  

def bfs():    global dist

     q = deque()
inf = 10 ** 4 + 1
for f in range(1,
               n + 1):  # visit all factories that aren't still included in any path        if pair_f[f] == 0:            dist[f] = 0            q.append(f)        else:            dist[f] = inf     dist[0] = inf  # inf, 0 is goin to be our nill vertex    while q:        f = q.popleft()        if (            dist[f] < dist[0]        ):  # solo se analizan caminos de tamanno k donde k es el nivel donde primero se da con nill            for a in current_graph[f]:                # looking for path that alternate between not taken and taken roads                if (                    dist[pair_a[a]] == inf                ):  # the aerports already visited were marked as inf                    dist[pair_a[a]] = dist[f] + 1                    q.append(pair_a[a])     return dist[0] != inf  def HopcroftKarp():    global pair_f    global pair_a    global dist     match = 0    pair_f = [0] * (n + 1)    pair_a = [0] * (n + 1)    dist = [-1] * (n + 1)     while bfs():        for f in range(1, n + 1):            if pair_f[f] == 0:                if dfs(f):                    match += 1     return match  def valuable_paper(min_d, max_d):    global current_graph     last_md = 10 ** 9 + 1    l = min_d    r = max_d    m = 0    while l <= r:        m = (l + r) // 2         current_graph = [[] for i in range(n + 1)]        for edge in graph:            if edge[2] <= m:                current_graph[edge[0]].append(edge[1])        current_graph[0] = [0]         matchings = HopcroftKarp()         if matchings == n:            last_md = m            r = m - 1        else:            l = m + 1     if last_md == (10 ** 9 + 1):        return -1    else:        return last_md  # input:# line1: n, m number of airports/factories and roads available(2<=n<=10^4; n-1<=m<=10^5)# m lines:#   line i: <v,v,d> is possible to build a road between vertices airpot u and factory v in d daysdef main_method():    global graph    global n    n, m = map(int, stdin.readline().split())    graph = []     for _ in range(m):        u, v, d = map(int, stdin.readline().split())        graph.append((u, v, d))     min_d = min(graph, key=lambda e: e[2])[2]    max_d = max(graph, key=lambda e: e[2])[2]     sol = valuable_paper(min_d, max_d)    stdout.write("{}\n".format(sol))  main_method()
