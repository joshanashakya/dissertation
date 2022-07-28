n, k = map(int, input().split())a = list(map(int, input().split()))left = 10 ** 18ans = 0for i in range(k):  if n % a[i] < left:    left = n % a[i]    ans = iprint(ans + 1, n // a[ans])
