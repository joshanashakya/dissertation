for _ in range(1):    n = int(input())    currH = 0    total = 0    for i in range(n):        h = int(input())                if currH <= h:            total += h - currH + 2            currH = h         else:            total += currH - h + 2            currH = h     print(total - 1)
