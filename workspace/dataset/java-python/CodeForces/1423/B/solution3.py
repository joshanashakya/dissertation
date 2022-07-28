import osimport

sysfrom
io
import BytesIO, IOBase
from types import GeneratorTypeBUFSIZE = 8192


class FastIO(IOBase):    newlines = 0


def __init__(self, file):        import os


self.os = os
self._fd = file.fileno()
self.buffer = BytesIO()
self.writable = "x" in file.mode or "r" not in file.mode
self.write = self.buffer.write if self.writable else None


def read(self):        while


True: b = self.os.read(self._fd, max(self.os.fstat(self._fd).st_size, BUFSIZE))
if not b:                break
ptr = self.buffer.tell()
self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)
self.newlines = 0
return self.buffer.read()


def readline(self):        while


self.newlines == 0: b = self.os.read(self._fd, max(self.os.fstat(self._fd).st_size, BUFSIZE))
self.newlines = b.count(b"\n") + (not b)
ptr = self.buffer.tell()
self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)
self.newlines -= 1
return self.buffer.readline()


def flush(self):        if


self.writable: self.os.write(self._fd, self.buffer.getvalue())
self.buffer.truncate(0), self.buffer.seek(0)


class IOWrapper(IOBase):    def


__init__(self, file): self.buffer = FastIO(file)
self.flush = self.buffer.flush
self.writable = self.buffer.writable
self.write = lambda s: self.buffer.write(s.encode("ascii"))
self.read = lambda: self.buffer.read().decode("ascii")
self.readline = lambda: self.buffer.readline().decode("ascii")
sys.stdin, sys.stdout = IOWrapper(sys.stdin), IOWrapper(sys.stdout)
input = lambda: sys.stdin.readline().rstrip("\r\n")


def getInts():    return [int(s) for s in input().split()]


from collections import deque


def maximum_matching(
        graph):    """Find a maximum unweighted matching in a bipartite graph. The input    must be a dictionary mapping vertices in one partition to sets of    vertices in the other partition. Return a dictionary mapping    vertices in one partition to their matched vertex in the other.     """  # The two partitions of the graph.    U = set(graph.keys())    V = set.union(*graph.values())     # A distinguished vertex not belonging to the graph.    nil = object()     # Current pairing for vertices in each partition.    pair_u = dict.fromkeys(U, nil)    pair_v = dict.fromkeys(V, nil)    if len(pair_u) != len(pair_v):        return []     # Distance to each vertex along augmenting paths.    dist = {}    inf = (1 << 28)     def bfs():        # Breadth-first search of the graph starting with unmatched        # vertices in U and following "augmenting paths" alternating        # between edges from U->V not in the matching and edges from        # V->U in the matching. This partitions the vertexes into        # layers according to their distance along augmenting paths.        queue = deque()        for u in U:            if pair_u[u] is nil:                dist[u] = 0                queue.append(u)            else:                dist[u] = inf        dist[nil] = inf        while queue:            u = queue.popleft()            if dist[u] < dist[nil]:                # Follow edges from U->V not in the matching.                for v in graph[u]:                    # Follow edge from V->U in the matching, if any.                    uu = pair_v[v]                    if dist[uu] == inf:                        dist[uu] = dist[u] + 1                        queue.append(uu)        return dist[nil] is not inf     def bootstrap(f, stack=[]):        def wrappedfunc(*args, **kwargs):            if stack:                return f(*args, **kwargs)            else:                to = f(*args, **kwargs)                while True:                    if type(to) is GeneratorType:                        stack.append(to)                        to = next(to)                    else:                        stack.pop()                        if not stack:                            break                        to = stack[-1].send(to)                return to        return wrappedfunc     @bootstrap    def dfs(u):        # Depth-first search along "augmenting paths" starting at        # u. If we can find such a path that goes all the way from        # u to nil, then we can swap matched/unmatched edges all        # along the path, getting one additional matched edge        # (since the path must have an odd number of edges).        if u is not nil:            for v in graph[u]:                uu = pair_v[v]                if dist[uu] == dist[u] + 1: # uu in next layer                    if (dfs(uu)):                        # Found augmenting path all the way to nil. In                        # this path v was matched with uu, so after                        # swapping v must now be matched with u.                        pair_v[v] = u                        pair_u[u] = v                        yield True            dist[u] = inf            yield False        yield True     while bfs():        for u in U:            if pair_u[u] is nil:                dfs(u)    return {u: v for u, v in pair_u.items() if v is not nil} N, M = getInts()max_edge = 0edges = [] u_set = set()v_set = set() while M:    u, v, d = getInts()    u_set.add(u)    v_set.add(v)    edges.append((u,v,d))    max_edge = max(d,max_edge)    M -= 1 l = 0r = max_edge+1ans = 2*(10**9)import collectionsif len(u_set) != N or len(v_set) != N:    print(-1) else:     while (l <= r):        m = (l + r) >> 1        G = collections.defaultdict(set)        for u,v,d in edges:            if d <= m:                G[u].add(v+N)        #print(m,G)        if not G:            l = m + 1            continue        matching = maximum_matching(G)        if (len(matching) == N):            ans = m            r = m - 1        else:            l = m + 1            if (ans == 2*(10**9)):        print(-1)    else:        print(ans)
