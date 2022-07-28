for _ in range(int(input())):    n = int(input())    s = list(map(int,input().split()))    s.sort()    x = []    for i in range(1,n):        x.append(s[i]-s[i-1])    print(min(x))
