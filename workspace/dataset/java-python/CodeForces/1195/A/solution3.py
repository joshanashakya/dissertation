#codea,b=map(int,input().split())l=[]c=0for i in range(a):    l.append(int(input())) s=set(l)for i in s:    if l.count(i)%2 != 0:        c+=1print(a-c//2)
