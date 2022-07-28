N = int(input())for _ in range(N):    _ = int(input())    a = sorted([int(ii) for ii in input().split(' ')], reverse=True)    print(*a, sep=' ')
