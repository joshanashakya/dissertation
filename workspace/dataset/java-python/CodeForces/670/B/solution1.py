n, k = map(int, input().split())a = list(map(int, input().split()))for i in range(1, n + 1):  if k > i:    k -= i  else:    breakprint(a[k - 1])
