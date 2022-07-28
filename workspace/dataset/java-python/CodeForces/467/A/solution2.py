n=int(input())b=0for i in range(n):    a=list(map(int,input().split()))    if(a[1]-a[0]>=2):        b+=1print(b)        
