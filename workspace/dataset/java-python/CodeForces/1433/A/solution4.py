for _ in range(int(input())):    n = input()
a = int(n[0])
d = {1: 1, 2: 3, 3: 6, 4: 10}
print((a - 1) * 10 + d[len(n)])
