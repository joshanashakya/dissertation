n=int(input())arr=list(map(int,input().split()))brr=sorted(arr,reverse=True)for i in range(n):    print(brr.index(arr[i])+1,end=" ")
