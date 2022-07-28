for _ in range(int(input())):
    ans = 0
    S = input()
    l = sorted(S.split("0"), reverse=True)
    for i in range(len(l)):
        if i % 2 == 0:
            ans += len(l[i])
    print(ans)
