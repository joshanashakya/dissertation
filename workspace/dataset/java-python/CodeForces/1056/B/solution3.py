n,m=map(int,input().split())ans=0for i in range(1,m+1):    for j in range(1,m+1):        if(i**2+j**2)%m==0:            ans+=((n-i)//m+1)*((n-j)//m+1)print(ans)
