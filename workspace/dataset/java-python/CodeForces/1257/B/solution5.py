t = int(input())for _ in range(t):  x, y = map(int, input().split())  if x >= y:    print('YES')  else:    if x == 2 and y == 3 or x >= 4:      print('YES')    else:      print('NO')
