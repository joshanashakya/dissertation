n, k = map(int, input().split())x = [*map(int, input().split())]f = x[k-1]if len(set(x[k-1:])) != 1: print(-1)elif k == 1 or len(set(x)) == 1:    print(0)else:    print(max([i for i, j in enumerate(x) if j != f])+1) 