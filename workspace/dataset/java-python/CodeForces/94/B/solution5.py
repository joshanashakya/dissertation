import sys
from array import array  # noqa: F401


def input():
    return sys.stdin.buffer.readline().decode('utf-8')


n = int(input())
matrix = [[0] * 5 for _ in range(5)]
for u, v in (map(int, input().split()) for _ in range(n)):
    matrix[u - 1][v - 1] = matrix[v - 1][u - 1] = 1

for i in range(5):
    if sum(matrix[i][j] for j in range(5) if i != j) != 2:
        print('WIN')
        exit()
print('FAIL')
