n, k = (int(x) for x in input().split())x = [int(x) for x in input().split()]flag = Trueif flag:    for i in range(1,n):        if x[i] - x[i-1] > k:            print(-1)            flag = False            breakif flag:    ans = 1    stop = x[-1] - k    i = 2    while i < n+1:        if stop <= x[0]:            break        if x[-i] > stop:            i += 1        elif x[-i] == stop:            ans += 1            stop = x[-i] - k            i += 1        else:           ans += 1           stop = x[-i + 1] - k     print(ans)
