import matht=int(input())
for i in range(0, t):    n = int(input())
l = list(map(int,
             input().split()))  # print(n,l)    dic={}    ans=0    for i in range(0,n):        dic[l[i]]=0    for i in range(0,n):        dic[l[i]]=dic[l[i]]+1    for i in dic.keys():        if(ans<dic[i]):            ans=dic[i]    print(ans)
