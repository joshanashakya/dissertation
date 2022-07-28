n, a, b = map(int, input().split())lis = list(map(int, input().split()))for i in lis:    x = (i*a)%b    print(int(x/a), end=' ')
