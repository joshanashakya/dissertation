k=int(input())s=str(input())s=list(s)d={}for i in s:    d[i]=s.count(i)cnt=0s1=''for j in d:    if d[j]%k==0:        cnt+=1        s1+=(j*int(d[j]/k))    if cnt!=len(d):    print(-1)else:    print(s1*k)