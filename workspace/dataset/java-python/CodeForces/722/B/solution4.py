vow=set(['a','e','i','o','u','y'])def f(x):    q=0    for y in x:        q+=int(y in vow)    return qn=int(input())p=[int(x) for x in input().split(' ')]fl=1for i in range(n):    s=[f(x) for x in input().split(' ')]    if(sum(s)!=p[i]):        fl=0print("YES" if (fl) else ("NO"))
