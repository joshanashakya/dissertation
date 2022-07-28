import sysn = int(sys.stdin.readline())l = list(map(int, sys.stdin.readline().split())) val = [0 for i in range(800010)]for i in range(n):    val[(i+1)-l[i]+400000] += l[i]print(max(val))
