n,x=map(int,input().split())l=list(map(int,input().split()))m=int(input())if m>=n:    print(sum(l)-(m-n)*x)    # j = sorted(l)    # print(j)else:    j=sorted(l)    # print(j)    c=0    for i in range (m):        c+=j[i]    print(c) 
