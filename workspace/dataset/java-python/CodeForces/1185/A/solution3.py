l = list(map(int, input().split(" ")))l, d = l[:3], l[3]sec = 0l.sort()sec = max(0, d - l[1] + l[0]) + max(0, d - l[2] + l[1])print(sec)
