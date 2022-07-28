import math def solve():  a, b = map(int, input().split())  if math.gcd(a, b) > 1:    print('Infinite')  else:    print('Finite') t = int(input())for _ in range(t):  solve()
