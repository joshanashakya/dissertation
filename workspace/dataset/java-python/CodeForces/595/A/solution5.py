n,m=map(int,input().split())count=0for i in range(n):    arr=list(map(int,input().split()))    for j in range(0,2*m,2):        if arr[j]==1 or arr[j+1]==1:            count+=1print(count)
