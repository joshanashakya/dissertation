n, k = list(map(int, input().split())) for t in range(1, n+1):    total = t*(t+1)//2    eat = total - k    if eat + t == n:        print(eat)        break
