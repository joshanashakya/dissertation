n=int(input())arr=list(map(int, input().split()))maxcount,count=1,1for i in range(n-1):  if arr[i]>arr[i+1]:    count = 1  else:    count+=1    if count>maxcount:      maxcount=countprint(maxcount)
