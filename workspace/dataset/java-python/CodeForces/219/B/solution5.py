import mathimport sysimport collectionsimport bisectimport stringimport timedef get_ints():return map(int, sys.stdin.readline().strip().split())def get_list():return list(map(int, sys.stdin.readline().strip().split()))def get_string():return sys.stdin.readline().strip()def num(arr):    ans=""    for i in arr:        ans+=i    return int(ans)for t in range(1):    n,m=get_ints()    ans=n    no=str(n)    pos=len(no)-1    c=0    while pos>=0:        if no[pos]=="9":            c+=1            pos-=1        else:            break    for k in range(c+1,20):        no=(n)-(n%(10**k))-1        #print(no)        if no==-1:            break        if n-no<=m:            ans=no    print(ans)
