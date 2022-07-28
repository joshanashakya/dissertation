import sysimport mathn=int(input())l=[int(i) for i in input().split()]l1=[]s=sum(l)c=0for i in range(n):    if(l[i]==(s-l[i])/(n-1)):        c+=1        l1.append(i+1)print(c)print(*l1)
