for t in range(int(input())):
    n = int(input())
    a = list(map(int, input().split()))
    q, z, r = [0] * n, n, []
    for i in range(n): q[n - a[i]] = i
    for i in q:
        if i < z: r += a[i:z];z = i
    print(*r)
