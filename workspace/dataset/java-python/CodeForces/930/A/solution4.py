n = int(input())a = list(map(lambda x: int(x), input().split()))a = [0,0] + ah = {}for i in range(2,len(a)):    count = 0    count = 1 + a[a[i]]    if count not in h:        h[count] = 0    h[count] += 1    a[i] = countt = 1for i in h:    if h[i] % 2!= 0:        t += 1print(t)
