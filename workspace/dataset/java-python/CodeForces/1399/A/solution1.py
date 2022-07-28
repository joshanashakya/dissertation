n = int(input())
for t in range(n):
    q = int(input())
    a = sorted(list(map(int, input().split())))
    g = 0
    for i in range(0, q - 1):
        if abs(a[i] - a[i + 1]) > 1:
            g = 1
    if g != 1:
        print('YES')
    else:
        print('NO')
