for _ in range(int(input())):
    n, u, v = map(int, input().split());
    lis = list(map(int, input().split()));
    ans = 2 ** 63
    for i in range(1, n):
        if abs(lis[i] - lis[i - 1]) > 1:
            ans = 0
        elif abs(lis[i] - lis[i - 1]) == 1:
            ans = min(ans, min(u, v))
        else:
            ans = min(ans, v + min(u, v))
    print(ans)
