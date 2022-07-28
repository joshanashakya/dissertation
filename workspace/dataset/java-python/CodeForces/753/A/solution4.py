n=int(input())cnt=0l=[]k=1while cnt+k<=n:  l.append(k)  cnt+=k  k+=1l[-1]+=n-cntprint(k-1)print(*l)
