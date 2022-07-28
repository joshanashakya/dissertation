n,k = map(int,input().split())arr = list(map(int,input().split()))min1=100000000000c=0for i in range(k):    sum1=sum(arr[i::k])   # print(sum1)    if sum1<min1:        c=i        min1= sum1print(c+1)
