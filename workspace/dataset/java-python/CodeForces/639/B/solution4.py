n,d,h=list(map(int,input().split()))if 2*h<d or (h==d==1 and n>2):    print(-1)else:    ans=[]    z=1    for i in range(h):        ans.append((i+1,i+2))        z=i+2    k=d-h    if k>0:        ans.append((1,z+1))        z+=1        k-=1        #print(ans)        for i in range(k):            ans.append((z,z+1))            z+=1        z+=1        #print(ans,z)                for i in range(z,n+1):            ans.append((1,i))        for a,b in ans:            print(a,b)    else:        for i in range(z+1,n+1):            ans.append((2,i))        for a,b in ans:            print(a,b)            