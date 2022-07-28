import sys

input = sys.stdin.readline
from operator import itemgetter

n = int(input())
A = list(map(int, input().split()))
MAX = max(A) - min(A)

COUNT = [[] for i in range(max(A) + 1)]
fl1 = 0
for i in range(n):
    COUNT[A[i]].append(i)

    if len(COUNT[A[i]]) == 4:
        print("YES")
        print(*[c + 1 for c in COUNT[A[i]]])
        exit()

    if len(COUNT[A[i]]) == 2:
        if fl1 == 0:
            fl1 = A[i]
        else:
            print("YES")
            print(COUNT[fl1][0] + 1, COUNT[A[i]][0] + 1, COUNT[A[i]][1] + 1, COUNT[fl1][1] + 1)
            exit()

X = [(A[i], i) for i in range(n)]

SA = [[] for i in range(MAX + 1)]

for i in range(n):
    for j in range(i + 1, n):
        sa = abs(X[j][0] - X[i][0])

        for x, y in SA[sa]:
            if X[i][1] != x and X[i][1] != y and X[j][1] != x and X[j][1] != y:
                if X[i][0] <= X[j][0]:
                    print("YES")
                    print(X[i][1] + 1, y + 1, x + 1, X[j][1] + 1)
                    exit()
                else:
                    print("YES")
                    print(X[j][1] + 1, y + 1, x + 1, X[i][1] + 1)
                    exit()

        if X[i][0] <= X[j][0]:
            SA[sa].append((X[i][1], X[j][1]))
        else:
            SA[sa].append((X[j][1], X[i][1]))

print("NO")
