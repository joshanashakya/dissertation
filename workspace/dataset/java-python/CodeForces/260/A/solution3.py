a, b, n = map(int, input().split())a = a * 10 + 9mod = a % bif mod > 9:    print(-1)    exit()else:    a -= moda = str(a) + '0' * (n - 1)print(a)
