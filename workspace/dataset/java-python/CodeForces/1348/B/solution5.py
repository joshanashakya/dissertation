def solve(n, k, a):    s = set(a)    if len(s) > k:        print(-1)        return    s = list(s)    while len(s) != k:        s.append(1)    s.sort()    res = s*n    print(len(res))    print(*res)  for _ in range(int(input())):    n, k = list(map(int, input().split()))    a = list(map(int, input().split()))    solve(n, k, a)