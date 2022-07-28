n, m = map(int, input().split())a = 1for i in range(n - 1):  a *= 10  a += 1b = 10 ** n - aprint(a)print(b)
