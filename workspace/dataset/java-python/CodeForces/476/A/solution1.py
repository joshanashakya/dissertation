n,m = map(int,input().split())count=0if(n<m):    print("-1")else:    if(n%2==0):        count= n//2    else:        count = n//2 + 1    while(count%m!=0):        count+=1    print(count)
