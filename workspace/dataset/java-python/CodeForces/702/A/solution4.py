n=int(input())l=list(map(int,input().split()))c=1a=[]for i in range(n-1):    if(l[i]<l[i+1]):        c+=1     else:        a.append(c)        c=1 a.append(c)print(max(a))
