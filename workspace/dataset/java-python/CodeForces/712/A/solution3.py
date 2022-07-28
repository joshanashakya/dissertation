n=int(input())li=list(map(int, input().split()))for i in range(n-1):    print(li[i]+li[i+1],end=' ')print(li[n-1]) 
