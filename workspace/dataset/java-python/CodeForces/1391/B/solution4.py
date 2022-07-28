# import sys
# import math
# sys.stdout=open("python/output.txt","w")
# sys.stdin=open("python/input.txt","r")
t = int(input())
for i in range(t):
    n, m = map(int, input().split())
    f = 0
    s = 0
    new = []
    for i in range(n):
        new.append(input())

    for i in range(n):
        for j in range(m):
            if j == m - 1:
                if new[i][j] == "R":
                    f += 1
            if i == n - 1:
                if new[i][j] == "D":
                    f += 1

    print(f)
