from collections import Countern=int(input())a = list(map(int, input().split()))b = list(map(int, input().split()))lst = [-1]*ncf = Counter(a)cs = Counter(b)miss1=0miss2=0for i in range(1,n+1):    if cf[i]==0:miss1=i    if cs[i]==0:miss2=is = 0cnt=0for i in range(n):    if a[i] == b[i]:        lst[i] = a[i]        s+=a[i]    else:        cnt+=1if cnt == 1:    for i in range(n):        if lst[i]==-1:            print(((n*(n+1))//2)-s,end=" ")        else:            print(lst[i],end=" ")elif cnt == 0:    for i in range(n):        if cf[a[i]]!=2:            print(a[i],end=" ")        else:            print(miss1,end="")else:    pp = []    f = 0    qq = []    l = [miss1,miss2]    for i in range(n):        if lst[i]!=-1:            pp.append(lst[i])            qq.append(lst[i])        else:            if f == 0:                pp.append(miss1)                qq.append(miss2)                f=1            else:                pp.append(miss2)                qq.append(miss1)    first = 0    second = 0    for i in range(n):        if pp[i] not in [a[i],b[i]]:first =1        if qq[i] not in [a[i],b[i]]:second=1    if first == 0:        print(*pp)    else:        print(*qq) 