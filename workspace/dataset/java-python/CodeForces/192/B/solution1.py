n=int(input())x=list(map(int,input().split()))m=min(x)l=mc=0a=x[0]b=x[-1]flag=0while True:    m=2**20    for i in range(1,n-1):        x[i]-=l        if x[i]<=0 and x[i-1]<=0:            flag=1            break        if x[i]>0:            m=min(m,x[i])    c+=l    if c>a or c>b:        break    if flag==1:        break    l=mprint(min(c,a,b))
