t = int(input())
ans = [] for _ in range(t):    n = int(input())
a = list(map(str, input().split()))     ind = []
c = 0     for i in range(len(a)):        if
a[i] == '1': ind.append(i)     for i in range(0, len(ind) - 1):        c += ind[i + 1] - ind[i] - 1     ans.append(
    c) for i in ans:    print(i)
