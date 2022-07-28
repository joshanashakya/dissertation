L = [int(X) for X in input().split()]S = sum(L)if S == 0:    print(-1)else:    if S%5 == 0:        print(S//5)    else:        print(-1)
