n=int(input())li=list(map(int,input().rstrip().split()))li.sort()cnt=0 i=0while i<n :    if li[i]==0:        i+=1    else:        p=li[i]        cnt1=1        j=i+1        while j<n and li[j]==p:            cnt1 +=1            j+=1        #print(li[i],cnt1,cnt)        if cnt1>2:            print(-1)            exit()        elif cnt1==2:            cnt+=1        i=i+cnt1 print(cnt)