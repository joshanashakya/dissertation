n=int(input())arr=list(map(int,input().split()))x=max(arr)divs=[]for z in range(1,x+1):    if x%z==0:        arr.pop(arr.index(z)) print(x,max(arr))
