from sys import stdin, setrecursionlimit setrecursionlimit(100000)  class Graph:	def __init__(self, No_of_nodes):		self.n = No_of_nodes		self.adj = [[] for i in range(self.n)] 	def addEdge(self, a, b):		self.adj[a].append(b)		self.adj[b].append(a)		count[a][0] += 1		count[b][0] += 1  def solve(start):	for i in g.adj[start]:		if i < start:			dp[start] = max(dp[start], dp[i] + 1)	return dp[start]  n, m = map(int, stdin.readline().split())g = Graph(n)count = [[0, i] for i in range(n)]dp = [1] * nfor i in range(m):	a, b = map(int, stdin.readline().split())	a -= 1	b -= 1	g.addEdge(a, b)for i in range(n):	solve(i)ans = -1000for i in range(n):	if dp[i] != -1:		ans = max(ans, (dp[i]) * len(g.adj[i]))print(ans)
