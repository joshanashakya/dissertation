arr=[int(x) for x in input().split()]n,k=arr[0],arr[1]c=n-k-1ans=[i+1 for i in range(c)]for i in range(n,n-k-1,-1):    ans.append(i)print(*ans)    
