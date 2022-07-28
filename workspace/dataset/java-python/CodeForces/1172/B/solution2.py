n = int(input())r = n; MAX = 998244353arr = [0] * (n + 1)for i in range(n - 1):    a, b = map(int, input().split())    arr[a] += 1; arr[b] += 1    r *= arr[a] * arr[b]    r %= MAXprint(r)
