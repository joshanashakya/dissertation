n,t=map(int,input().split())a=list(map(int,input().split()))for i in range(n):  if 86400-a[i]>=t:    print(i+1)    break  else:    t-=86400-a[i]    
