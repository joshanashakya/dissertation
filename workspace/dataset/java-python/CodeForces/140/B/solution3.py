def f():    t = [0] * n    for i, j in enumerate(input().split()): t[int(j) - 1] = i    return tn = int(input())p = [f() for i in range(n)]s = f()for x, t in enumerate(p):    i = j = x < 1    for y in range(n):        if x != y and s[y] < s[i]: i = y        if t[i] < t[j]: j = i    print(j + 1)
