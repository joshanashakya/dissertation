n = int(input())path = list(input())if path.count('R') == 0:    t = path.index('L')    s = n - path[::-1].index('L')elif path.count('L') == 0:    s = path.index('R') + 1    t = n - path[::-1].index('R') + 1else:    s = path.index('R') + 1    t = path.index('L') print(s, t)