m=[]for _ in range (int(input())):    l=list(map(int,input().split()))    x=sum(l)    m.append(x)j=sorted(m,reverse=True)# print(m,j)for i in range (0,len(m)):    if j[i]==m[0]:        i=i+1        breakprint(i)
