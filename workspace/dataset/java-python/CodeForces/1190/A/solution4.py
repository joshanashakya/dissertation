n,m,k=map(int,input().split())ar=list(map(int,input().split()))page=kobj=0temp=0count=0i=0while i<m:    if ar[i]-obj<=page:        temp+=1        i+=1        continue    if temp!=0: count+=1    obj+=temp    temp=0    if (ar[i]-obj)>page:         page+=k*(int((ar[i]-obj-page+k-1)/k))if temp!=0: count+=1print(count)        
