n=int(input())nn=list(map(int,input().split()))m=int(input())mm=list(map(int,input().split()))nn.sort()mm.sort()i=0j=0count=0 while i<n and j<m:    if abs(nn[i]-mm[j])<=1:        count+=1        i+=1        j+=1    elif nn[i]<mm[j]:        i+=1    else:        j+=1print(count)