n, k = list(map(int, input().split()))a = list(map(int, input().split()))r, s, x = n-k+1, 0, []x.append(a[0])for i in range(1, n+1):    x.append(x[i-1] + a[i-1])for i in range(k, n+1):    s += x[i] - x[i-k]print(s/r)
