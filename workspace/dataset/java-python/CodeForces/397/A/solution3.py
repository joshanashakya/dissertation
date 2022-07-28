n = int(input())ans = [1]*100 a, b = map(int, input().split()) for k in range(n-1):    l, r = map(int, input().split())    for i in range(l, r):        ans[i] = 0 print(sum(ans[a:b]))
