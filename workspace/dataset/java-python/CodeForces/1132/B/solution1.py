n=int(input())arr=sorted(list(map(int,input().split())))summa=sum(arr)m=int(input())marr=list(map(int,input().split()))for x in marr:    print(summa-arr[len(arr)-x])
