n = int(input())arr =[]for _ in range(n):    a,b = map(int,input().split())    arr.append([a,b])ans = min(arr[0])+1for i in range(n-1):    if max(arr[i])<=min(arr[i+1]):        if arr[i][0]==arr[i][1]:            ans-=1        ans+= min(arr[i+1])-max(arr[i])+1print(ans)