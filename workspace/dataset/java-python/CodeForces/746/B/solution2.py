n=int(input())x=list(input().strip())ans=[]  if n==1:    print(x[0])    exit(0)if n==1:    print(x[0]+x[1])    exit(0) if n%2!=0:    for i in range(n-2,-1,-2):        ans.append(x[i])     for i in range(0,n,2):        ans.append(x[i])else:    for i in range(n-2,-1,-2):        ans.append(x[i])     for i in range(1,n,2):        ans.append(x[i])   print(''.join(ans))
