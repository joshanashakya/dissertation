n = int(input())x = {}y = {}for i in range(n):    a, b = [int(i) for i in input().split()]    x[a] = 0    y[b] = 0print(len(x) if len(x) <= len(y) else len(y))
