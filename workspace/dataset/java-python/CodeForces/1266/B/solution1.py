t = int(input())a = list(map(int, input().split()))for x in a:  if x > 14 and x % 14 in range(1, 7):    print('YES')  else:    print('NO')
