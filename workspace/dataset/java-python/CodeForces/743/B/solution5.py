while True:    try:        n,m = list(map(int,input().split()))        res = 1        while m % 2 == 0:            res += 1            m /= 2        print(res)    except:        break
