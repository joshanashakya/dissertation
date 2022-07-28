for _ in range(int(input())):
    n, k = map(int, input().split())
    l = list(map(int, input().split()))
    for z in range(2 - k % 2):
        d = max(l)
        for i in range(len(l)):
            l[i] = d - l[i]
    print(*l)
