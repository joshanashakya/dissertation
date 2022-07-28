import mathn = int(input())res = 0while n>=2:    n -= math.pow(2,math.floor(math.log2(n)))    res+=1print(int(res+n))
