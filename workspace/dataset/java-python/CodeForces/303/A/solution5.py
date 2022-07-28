n=int(input())arr=[i for i in range(n)]#print(arr)ans=[]for i in range(n):  ans.append((2*i)%n)if sorted(ans)!=arr:print(-1)else:print(*arr);print(*arr);print(*ans)
