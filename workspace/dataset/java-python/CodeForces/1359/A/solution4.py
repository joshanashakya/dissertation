for i in range(int(input())):    a,b,c=list(map(int,input().split()))    print((a//c)+(-(b-(a//c))//(c-1))  if a//c<b else b )
