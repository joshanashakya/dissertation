from sys import stdinn, x = map(int, stdin.readline().split())a = list(map(int, stdin.readline().split()))d = [0] * 101for i in a:    d[i] = 1print(x - sum(d[:x]) + d[x])
