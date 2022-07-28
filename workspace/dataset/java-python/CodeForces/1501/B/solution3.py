for _ in range(int(input())):
    n = int(input())
    a = [int(y) for y in input().split()]
    mn = 0
    b = [0] * n
    for idx, i in enumerate(a[::-1]):
        if mn < i: mn = i
        if mn != 0:
            b[n - 1 - idx] = 1
            mn -= 1
    print(*b, end='\n')
