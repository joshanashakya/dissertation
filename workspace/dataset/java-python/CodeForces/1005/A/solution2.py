n=int(input())l=list(map(int,input().split()))c=0s=[]d=1for i in l:    if(i==d):        d+=1    else:        s.append(d-1)        d=2        c+=1s.append(d-1)c+=1print(c)for i in s:    print(i,end=' ')
