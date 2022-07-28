n = int(input()) L, R = 0, 0for _ in range(n):     (l, r) = (int(i) for i in input().split(' '))    L+=l    R+=r print(min(n-R, R) + min(n-L, L))
