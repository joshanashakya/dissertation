# A. Sereja and Dimat=int(input())n=list(map(int,input().split()))i=0j=t-1 s=0d=0for k in range(t):    if k%2==0:        s+=max(n[i],n[j])        if n[i]>=n[j]:            i+=1        else:            j-=1      else:        d+=max(n[i],n[j])        if n[i]>=n[j]:            i+=1        else:            j-=1#     print(s,d,i,j)        print(s,d)
