def solve():  l, r, d = map(int, input().split())  if d < l or d > r:    print(d)  else:    print((int(r / d) + 1) * d) q = int(input())for _ in range(q):  solve()
