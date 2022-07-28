n,s=map(int,input().split())arr=list(map(int,input().split()))count=0summation=sum(arr)max1=max(arr)if summation-max1<=s:    print("YES")else:    print("NO")
