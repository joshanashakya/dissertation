n=int(input())a=list(map(int,input().split()))flag=0for i in range(1,n):  k=set()  xdif=i  ydif=a[i]-a[0]  k.add(a[0]*xdif)  for j in range(n):    k.add(a[j]*xdif-(ydif*j))  if len(k)==2:    flag=1    breakxdif=1ydif=a[2]-a[1]k=set()k.add(a[1]*xdif-ydif)for j in range(n):  k.add(a[j]*xdif-(ydif*j)) if len(k)==2:  flag=1if flag:  print('Yes')else:  print('No')