n=int(input())l=list(map(int,input().split()))c=0q=[]while l:    m=min(l)    for i in list(l):        if i%m==0:            c+=1            l.remove(i)    q.append(c)    c=0                 print(len(q))  