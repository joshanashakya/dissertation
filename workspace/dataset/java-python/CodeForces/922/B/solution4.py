n=int(input())count=0for i in range(1,n+1):    for j in range(i,n+1):        temp=i^j        if temp<j or temp>n or i+j<=temp:continue        count+=1print(count)
