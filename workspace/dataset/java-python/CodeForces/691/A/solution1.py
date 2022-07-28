n = int(input())a = list(map(int, input().split()))if n == 1 and a[0] == 1 or n > 1 and a.count(0) == 1:  print('YES')else:  print('NO')
