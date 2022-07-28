n=int(input())p=input().split()res=dict()for idx, ele in enumerate(p):    res[ele] = idxfor i in range(1,n+1):    if str(i) not in res:        print(i)
