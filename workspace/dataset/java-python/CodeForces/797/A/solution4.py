import sysfrom math import sqrt def isPrime(n):    i=2    while i*i <= n:         if n%i == 0:            return False        i += 1    return True def primes(n):    arr=[]    nums=0    for i in range (2,10000):#int(sqrt(n)+1)):        if isPrime(i):            arr.append(i)            nums+=1    return arr, nums n,k=map(int, sys.stdin.readline().split())arr_Primes, nums= primes(n)#print(nums)#print(arr_Primes,"arreglo de primos")if isPrime(n) and k == 1:    print(n)else:     #sol(n,k)    i=0    ans=[]     for i in range (len(arr_Primes)):            while n % arr_Primes[i] == 0:                ans.append(arr_Primes[i])                n//=arr_Primes[i]            if n==1:                break     #print(ans,"anss")    if len(ans)<k:        print(-1)    else:        ans2=1        for i in range (k-1):            print(ans[i],end=" ")        for i in range (k-1,len(ans)):            ans2*=ans[i]        print(ans2)
