n=int(input())b=list(map(int,input().split()))a=[0]*ncount=abs(b[0])for i in range(1,n):	count+=abs(b[i]-b[i-1])print(count)
