n,m,k=map(int,input().split())if k<n:  print(k+1,1)else:  k-=n  floor=n-k//(m-1)  if floor%2:    print(floor, m-k%(m-1))  else:    print(floor, (k%(m-1))+2)
