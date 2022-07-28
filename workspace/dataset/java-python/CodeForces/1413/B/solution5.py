import sys

input = sys.stdin.readlinefor
_ in 'A' * int(input()): n, m = map(int, input().split())
c = [0] * (n * m + 1)
r = [0] * (n * m + 1)
matrix = [[0] * m for i in range(n)]
for i in range(n):        row = list(map(int, input().split()))
for j in range(m):            c[row[j]] = j
for j in range(m):        column = list(map(int, input().split()))
for i in range(n):            r[column[i]] = i
for i in range(1, n * m + 1):        matrix[r[i]][c[i]] = i
for i in range(n):        print(*matrix[i])
