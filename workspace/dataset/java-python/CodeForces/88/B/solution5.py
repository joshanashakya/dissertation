import sysfrom

array
import \
    array  # noqa: F401from math import hypotfrom collections import defaultdict  def input():    return sys.stdin.buffer.readline().decode('utf-8')  n, m, x = map(int, input().split())keyboard = [input().rstrip() for _ in range(n)]keys = set()inf, eps = 10**9, 1e-9dist = defaultdict(lambda: inf)shift = [] for i in range(n):    for j in range(m):        if keyboard[i][j] == 'S':            shift.append((i, j)) for i in range(n):    for j in range(m):        if keyboard[i][j] == 'S':            continue        keys.add(keyboard[i][j])        for ti, tj in shift:            dist[keyboard[i][j].upper()] = min(dist[keyboard[i][j].upper()], hypot(i - ti, j - tj)) q = int(input())ans = 0for c in input().rstrip():    if c.lower() not in keys:        print(-1)        exit()    if 65 <= ord(c) <= 90:        if not shift:            print(-1)            exit()        if dist[c] - eps > x:            ans += 1 print(ans)
