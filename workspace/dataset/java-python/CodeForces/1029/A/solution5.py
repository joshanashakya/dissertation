n,k=list(map(int,input().split()))s=input()for x in range(1,n):    if s[:-x] == s[x:]:        print (s + s[-x:]*(k-1))        breakelse:    print (s*k)
