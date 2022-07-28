n, a = int(input()), [0] + list(map(int, input().split())) + [0]x = []for i in range(n + 1):    x.append(max(a[i], a[i + 1]))print(min(x))
