n=int(input())t1=[]t2=[]for _ in range(n):    t,w=map(int,input().split())    if t==1:        t1.append(w)    else:        t2.append(w)t1.sort()t2.sort()n1=len(t1)n2=len(t2)p1=[0]p2=[0]for i in range(n1):    p1.append(p1[-1]+t1[i])for i in range(n2):    p2.append(t2[i]+p2[-1])ans=1while True:    am=False    b=0    while 2*b<=ans:        a=ans-2*b        if a<=n1 and b<=n2:            if p1[n1-a]+p2[n2-b]<=ans:                am=True                break        b+=1    if am:        print(ans)        break    ans+=1
