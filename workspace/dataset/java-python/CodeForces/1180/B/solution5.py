n=int(input())l=list(map(int,input().split()))neg,neg1=0,[]pos,pos1=0,[]for i in range(n):    if l[i]>=0:        l[i]=-l[i]-1if n%2==0:    print(*l)else:    l1=sorted(l)    l[l.index(l1[0])]=-l1[0]-1    print(*l)
