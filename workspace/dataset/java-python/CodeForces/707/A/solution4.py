n, m = map(int, input().split())s = 0for i in range(n):	a = [i for i in input().split()]	s += a.count('W') + a.count('B') + a.count('G')if s == n * m:	print('#Black&White')else:	print('#Color')
