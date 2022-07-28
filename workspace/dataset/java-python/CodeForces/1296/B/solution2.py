t = int(input())for _ in range(t):    n = int(input())    res = n    while n // 10 > 0:        res += n // 10        n = n % 10 + n // 10    print(res)
