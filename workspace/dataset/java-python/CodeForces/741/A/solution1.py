def gcd(a,b):    if b==0:        return a    return gcd(b, a%b)def lcm(a,b):    return a*b/gcd(a,b)def dfs(sad, num, posjeceno):    """if sad==a[sad]-1 and posjeceno!=[0]*n:        return (-10, [])"""    posjeceno[sad]=1    if posjeceno[a[sad]-1]==1:        return (num+1, posjeceno)    return dfs(a[sad]-1, num+1, posjeceno) def trazi(oznaka):    global memo    if memo[oznaka]==[]:        memo[oznaka]=dfs(oznaka, 0, [0]*n)    return memo[oznaka]n=int(input())a=list(map(int,input().split()))d=set()brojac=nmemo=[[] for e in range (n)]while brojac>-1:    brojac-=1    if memo[brojac]==[]:        trazi(brojac)        """if memo[brojac][0]==-10:            d=-10            break"""        l=memo[brojac][1]        for w in range(n):            if l[w]==1:                if trazi(w)[1]!=l:                    d=-10                    break        if d==-10:            break    vrati, l=trazi(brojac)    if vrati%2==0:        d.add(float(vrati/2))    else:        d.add(float(vrati))if d==-10:    print(-1)else:    sol=1    for r in d:        sol=lcm(sol, r)    print(int(sol))