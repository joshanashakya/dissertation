from bisect import bisect_left

n = int(input())
l = list(map(int, input().split()))
if n == 1:
    print(1, 1)
    print(-1 * l[0])
    print(1, 1)
    print(0)
    print(1, 1)

    print(0)
else:
    print(1, n)
    x = n - 1
    for i in range(n):
        t = l[i]
        if l[i] % x:
            l[i] += (x + 1) * (x - t % x)
        print(l[i] - t, end=" ")
    x = x - 1
    print()
    print(2, n)
    for i in range(1, n):
        print(-1 * l[i], end=" ")
    print()
    print(1, 1)
    print(-1 * l[0])
