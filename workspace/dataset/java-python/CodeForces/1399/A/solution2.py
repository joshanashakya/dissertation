t = int(input())
for x in range(t):
    n = int(input())
    list_a = sorted([int(k) for k in input().split()])
    f = 1
    for i in range(0, n - 1):
        if abs(list_a[i] - list_a[i + 1]) > 1:
            f = 0
    if f == 1:
        print('YES')
    else:
        print('NO')
