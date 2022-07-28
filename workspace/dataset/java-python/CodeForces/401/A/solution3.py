n,x=list(map(int,input().split()))val=abs(sum(list(map(int,input().split()))))if val%x==0:	print(val//x)else:	print(val//x+1)
