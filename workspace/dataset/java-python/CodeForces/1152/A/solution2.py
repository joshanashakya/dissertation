i=lambda:map(int,input().split())n,m=i();a,b=i(),i()x=sum(x%2 for x in a)y=sum(x%2 for x in b)print(min(x,m-y)+min(y,n-x))
