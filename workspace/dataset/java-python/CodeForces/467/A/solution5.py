n = int(input())i = 0for _ in range(n):    p,q = tuple(map(int,input().split(' ')))    if p < q-1:        i += 1print(i)
