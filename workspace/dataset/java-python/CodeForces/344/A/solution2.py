n = int(input())current = input()c = 1for _ in range(1, n):    x = input()    if current != x:        c += 1        current = xprint(c)
