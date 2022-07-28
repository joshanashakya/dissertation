n, m, x, y = map(int, input().split())
print(x, y)
print(1, y)

for i in range(1, n + 1):
    if (i % 2 == 1):
        for j in range(1, m + 1):
            if ([i, j] != [x, y] and [i, j] != [1, y]):
                print(i, j)
    else:
        for j in range(m, 0, -1):
            if ([i, j] != [x, y] and [i, j] != [1, y]):
                print(i, j)
