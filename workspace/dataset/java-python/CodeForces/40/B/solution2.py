n,m=map(int,input().split())x=int(input())w,h=n-(2*x-1),m-(2*x-1)if w<0 or h<0:    print(0)else:    print(max(w+h,1))
