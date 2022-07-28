# your code goes hereimport mathfor _ in range(int(input())):       x=int(input())    z=list(map(int,input().split()))    ans=0    for i in range(x):    	ans=max(0,ans+z[i])    print(ans)
