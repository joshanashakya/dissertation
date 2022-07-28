for _ in range(int(input())):    n=int(input())    l=list(map(int,input().split()))    p=0    for i in l:        p+=i%2    if p==0 or p==n:        print("YES")    else:        print("NO")
