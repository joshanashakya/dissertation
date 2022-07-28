for _ in range(int(input())):
    n = int(input())
    a = list(map(int, input().split()))

    b = 0
    for i in range(n - 1, -1, -1):
        b = max(b, a[i])
        a[i] = 1 if b > 0 else 0
        b -= 1

    print(*a)
