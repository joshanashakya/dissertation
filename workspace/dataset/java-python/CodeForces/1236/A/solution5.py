t = int(input()) for _ in range(t):    a, b, c = map(int, input().split())     stones = 0    while(c>=2 and b>=1):        stones += 3        c -= 2        b -= 1     while(b>=2 and a>=1):        stones += 3        b -= 2        a -= 1     print(stones)
