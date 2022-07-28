a=list(map(int,input().split()))c=a[0]for i in range(a[1]):    if(c%10==0):        c=c/10    else:        c=c-1print(int(c))            
