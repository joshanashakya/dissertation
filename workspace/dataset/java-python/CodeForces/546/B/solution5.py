n = int(input())a = list(map(int, input().split()))res = 0a.sort()for i in range(n):    if i > 0 and a[i] <= a[i-1]:        res += a[i-1] + 1 - a[i]        a[i] = a[i-1] + 1print(res)
