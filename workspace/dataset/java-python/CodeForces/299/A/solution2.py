n = int(input())a = list(map(int,input().split()))k = min(a)for i in a:    if i%k!=0:        exit(print(-1))print(k)                 
