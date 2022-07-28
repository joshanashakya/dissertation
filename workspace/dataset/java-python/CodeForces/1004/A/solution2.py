n, d = map(int, input().split())li = list(map(int, input().split()))c = 2for i in range(1, n):    if (li[i] - li[i-1]) == 2*d:        c = c + 1    if (li[i] - li[i-1]) > 2*d:        c = c + 2print(c)
