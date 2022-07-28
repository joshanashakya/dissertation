n = int(input().strip())for i in range(n):    a = []    for j in range(n):        a += [j * n + (j + i) % n + 1]    print(*a)
