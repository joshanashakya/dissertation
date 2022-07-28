n, k = map(int, input().split())a = list(map(int, input().split()))c = 0for i in a:    if i > 0 and i >= a[k - 1]:         c = c + 1print(c)
