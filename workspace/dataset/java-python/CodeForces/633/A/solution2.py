a, b, c = map(int, input().split()) for i in range(1 + c//a):    if (c - i*a) % b == 0:        print('Yes')        exit(0) print('No')
