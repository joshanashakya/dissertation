# problem statement: https://codeforces.com/problemset/problem/578/A coord = input()a, b = list(map(int, coord.split())) if b > a:	print(-1)else:	sol1 = (a + b)/(2 * int((a+b)/(2*b)))	print(sol1)
