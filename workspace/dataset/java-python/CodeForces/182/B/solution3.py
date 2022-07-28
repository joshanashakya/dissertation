d=int(input())n=int(input())x=list(map(int,input().split()))s=0for i in range(n-1):    s+=d-x[i]print(s)
