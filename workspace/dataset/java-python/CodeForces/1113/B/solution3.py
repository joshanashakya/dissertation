n=int(input())arr=list(map(int,input().split()))minn=min(arr);summ=sum(arr);ans=0for i in  range(n):  for j in range(1,arr[i]+1):    if arr[i]%j==0:       ans=max(ans,(minn+arr[i])-(minn*j+(arr[i]//j)))print(summ-ans)   