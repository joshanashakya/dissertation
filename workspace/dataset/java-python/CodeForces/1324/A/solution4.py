for _ in range(int(input())):    n=int(input())    l=list(map(int,input().split()))    ans=0    sum=0    for i in l:        if i%2==0:            ans+=1        elif i%2!=0:            sum+=1    if ans==n or sum==n:        print("YES")         else:        print("NO")      