T = int(input())
for t in range(T):
    n = int(input())
    a = list(map(int, input().split()))
    b = [0] * n
    b[n - 1] = a[n - 1]
    for i in range(n - 2, -1, -1):
        b[i] = max(b[i + 1] - 1, a[i])
    print(" ".join([("0", "1")[e > 0] for e in b]))
