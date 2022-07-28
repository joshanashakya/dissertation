for t in range(int(input())):    n,k = map(int, input().split())    if n%2==0: print(n+k*2)    else:        for i in range(2,n+1):            if n%i==0: print(n+i+(k-1)*2); break
