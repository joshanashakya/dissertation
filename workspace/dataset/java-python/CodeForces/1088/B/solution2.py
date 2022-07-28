n, k = map(int, input().split())a = sorted(list(set(map(int, input().split()))) + [0])for i in range(1, k + 1):  if i < len(a):    print(a[i] - a[i - 1])  else:    print(0)
