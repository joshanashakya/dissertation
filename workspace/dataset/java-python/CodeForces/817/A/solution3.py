a, b, c, d = map(int, input().split())x, y = map(int, input().split())m = abs(c - a)n = abs(d - b)if m % x != 0 or n % y != 0:  print('NO')elif (m // x) % 2 != (n // y) % 2:  print('NO')else:  print('YES')
