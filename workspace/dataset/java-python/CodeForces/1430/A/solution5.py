import sysinput = sys.stdin.readline for _ in range(int(
        input())):  # n, m = map(int, input().split())    n = int(input())    #a = list(map(int, input().split()))    # n, k1, k2 = map(int, input().split())    c = 0    for i in range(n//7 + 1):        for j in range(n//5 + 1):            if i*7 + j*5 > n:                break            for k in range(n//3 + 1):                if i*7 + j*5 + k*3 == n:                    print(k, j, i)                    c = 1                    break            if c == 1:                break        if c == 1:            break    if c == 0:        print(-1) 