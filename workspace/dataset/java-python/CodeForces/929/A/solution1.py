n, k = [int(i) for i in input().split()]X = [int(i) for i in input().split()]rem = kcnt = 1for i in range(len(X)-1):    if X[i+1] - X[i] > rem:        rem = k        cnt += 1        if X[i+1] - X[i] > rem:            print(-1)            break    rem -= X[i+1] - X[i]else:    print(cnt)