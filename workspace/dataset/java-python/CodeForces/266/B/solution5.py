import sys input = sys.stdin.readline sys.setrecursionlimit(10 ** 5 + 1) n, t = map(int, input().split())s = list(input()) for i in range(t):    j = 1    while j < n:        if s[j-1] == "B" and s[j] == "G":            s[j-1], s[j] = "G", "B"            j += 1        j += 1print(*s , sep="")