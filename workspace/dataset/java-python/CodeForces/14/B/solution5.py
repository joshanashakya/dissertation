# t = int(input()) def solve():    pass result = []for i in range(1):    n, x0 = [int(x) for x in input().strip().split(' ')]     overlap = [0] * 1001         for j in range(n):        a, b = [int(x) for x in input().strip().split(' ')]         if b < a:            a, b = b, a                for k in range(a, b+1):            overlap[k] += 1        move_here = []    for j in range(1001):        if overlap[j] == n:            move_here.append(j)        if not move_here:        print(-1)    elif x0 >= move_here[0] and x0 <= move_here[-1]:        print(0)    else:        print(min(abs(x0 - move_here[0]), abs(x0 - move_here[-1])))    