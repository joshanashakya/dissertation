# # FROG JUMPING # #t = int(input())for i in range(t):    a, b, k = map(int, input().split())    x = k//2    y = k - x    new = 0    print((a*y)-(b*x))
