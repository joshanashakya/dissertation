n = int(input())a = list(map(int, input().split()))i = a.index(max(a))if a[:i] == sorted(a[:i]) and a[i:] == sorted(a[i:], reverse=True):  print('YES')else:  print('NO')
