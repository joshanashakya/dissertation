for i in range(int(input())):    a,b,n,s=map(int,input().split())    if (s <= a*n+b and s%n <= b):        print("YES")    else:        print("NO")
