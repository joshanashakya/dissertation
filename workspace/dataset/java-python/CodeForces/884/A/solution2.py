n, t = map(int, input().split())lst = [int(i) for i in input().split()] for i, val in enumerate(lst):    t -= 86400 - val     if t <= 0:        print(i+1)        break
