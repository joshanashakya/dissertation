n,m=map(int,input().split())l=sorted(list(map(int,input().split())))c=0s=0for i in l:    if(i<0 and c<m):        s+=i         c+=1     else:        break print(-s)
