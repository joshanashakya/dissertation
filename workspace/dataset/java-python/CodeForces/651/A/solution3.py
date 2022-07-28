a,b=map(int,input().split())count=0while max(a,b)>1 and min(a,b)>0:    a,b=max(a,b)-2,min(a,b)+1    count+=1print(count)
