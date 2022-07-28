n = int(input())a = list(input())p = 0for i in range(len(a)):    if a[i] == '+':        p = p + 1        n = n + 1    elif a[i] == '-':        p = p - 1        if p < 0:            p = 0print(p)
