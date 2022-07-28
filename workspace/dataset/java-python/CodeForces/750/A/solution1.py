n,k=map(int,input().split())t=240-ki=1count=0while t>=i*5 and count<n:    count+=1    t=t-i*5    i+=1print(count)
