n,m=map(int,input().split())l=list(map(int,input().split()))l1=list(map(int,input().split()))d=dict.fromkeys(l1)for i in l:    if(i in d):        print(i,end=' ')
