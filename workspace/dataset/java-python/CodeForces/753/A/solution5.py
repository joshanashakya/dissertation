n = int(input())k = 0if n==2:    print(1)    print(2)    exit()if n==1:    print(1)    print(1)    exit()for i in range(1,n):    k += i    if k==n:        print(i)        for i in range(1,i+1):            print(i,end=' ')        exit()    if k > n:        k -= i + i - 1        breakprint(i-1)for i in range(1,i-1):    print(i,end=' ')print(n-k)        