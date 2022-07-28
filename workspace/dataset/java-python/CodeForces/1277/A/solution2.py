for _ in range(int(input())):    n = int(input())    tmp = 0    for i in range(1,10):        k = i        while k <= n:            tmp += 1            k = k * 10 + i    print(tmp)
