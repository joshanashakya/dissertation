n=int(input())a=list(map(int,input().split(" ")))lim=a[0]a[1:]=sorted(a[1:])t=0while(a[0] <= a[-1]):    a[0]=a[0]+1    a[-1]=a[-1]-1    t+=1    a[1:]=sorted(a[1:])print(t)
