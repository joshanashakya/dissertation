n,m=map(int,input().split())arr=[int(ele)for ele in input().split()]s=set()li=[]for i in range(n-1,-1,-1):    s.add(arr[i])    arr[i]=len(s)for i in range(m):    l=int(input())    li.append(l)for i in li:    print(arr[i-1])