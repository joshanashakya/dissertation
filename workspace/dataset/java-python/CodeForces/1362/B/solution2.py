for t in range(int(input())):    n=int(input())    a=set([int(i) for i in input().split()])    for k in range(1,1024+1):        s=set([i^k for i in a])        if a==s:            print(k)            break    else:        print(-1)
