n,a,x,b,y=map(int,input().split())flag=0while a!=x and b!=y:    a+=1    b-=1    if a==n+1:        a=1    if b==0:        b=n    if a==b:        flag=1        breakif flag==0:    print('NO')else:    print('YES')