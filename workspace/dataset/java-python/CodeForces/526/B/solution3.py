n = int(input())lis=[0]*2+list(map(int,input().split()))#n-=1ans=0while n>0:    aa=2**(n)    chal=2**n#    print(aa,aa+chal)    for i in range(aa,aa+chal,2):        ans+=abs(lis[i]-lis[i+1])#        print(ans)        j = max(lis[i],lis[i+1])        lis[i//2]+=j    n-=1print(ans)        