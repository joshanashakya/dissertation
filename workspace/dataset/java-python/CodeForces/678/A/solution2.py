n, k = map(int, input().split())ceil = (n + k - 1) // kif ceil * k > n:    print(ceil * k)else:    print(ceil * k + k)
