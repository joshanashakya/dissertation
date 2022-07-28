for _ in range(int(input())):    n,k=map(int,input().split())    print(min(n//k*(k//2+(k%2==1))+(n//k+1)*(k//2),n))
