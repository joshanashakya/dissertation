for _ in range(int(input())):
    n, k = map(int, input().split())
    a = [i for i in range(1, n + 1) if i != k and (i > k or 2 * i >= k)]
    print(len(a), "\n", *a)
