n,m=map(int,input().split())mx=0ch=1curr=0while n :    n-=1    a,b=map(int,input().split())    if curr < a and mx <a:        ch=0    if ch==1:        if b > mx:            mx= b         curr=b    if curr >= m or mx >=m:      print("YES")else:    print("NO")            
