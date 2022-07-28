n, k = map(int, input().split())a = sorted(list(set(map(int, input().split()))))for i in range(k):  if i == 0:    print(a[i])  elif i < len(a):    print(a[i] - a[i - 1])  else:    print(0)
