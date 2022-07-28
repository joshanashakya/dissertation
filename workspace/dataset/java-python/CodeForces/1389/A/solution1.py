for i in range(int(input())):
    m, n = map(int, input().split())
    if n % m == 0:
        print(m, n)
    elif m * 2 <= n:
        print(m, m * 2)
    else:
        print(-1, -1)
