n=int(input())l=list(map(int,input().split()))max1=0arr1=[]for i in range (n-1,-1, -1):    if l[i] >max1:        max1=l[i]        arr1.append(0)    elif l[i]==max1:        arr1.append(1)    else:        arr1.append(max1-l[i]+1)arr1=arr1[::-1]print(*arr1)
