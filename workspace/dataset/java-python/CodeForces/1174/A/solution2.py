n = int(input())l = sorted([int(x) for x in input().split()])if len(set(l)) ==1:    print(-1)else:    print(*l)
