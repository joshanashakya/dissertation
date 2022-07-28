for _ in range(int(input())):    n=int(input())    a=list(map(int,input().split()))+[0]    ans,i=['First','Second'],0    while(a[i]==1): i+=1    if i==n: i+=1    print(ans[i%2])
