n = int(input())a = []for i in range(n):    l, r = map(int, input().split())    a.append((r, l))a.sort()L = -1ans = 0for x in a:    if x[1] > L:        L = x[0]        ans += 1print(ans)
