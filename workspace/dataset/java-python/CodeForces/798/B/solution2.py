def check(string1, string2):    size1 = len(string1)    size2 = len(string2)    temp = ''    if size1 != size2:        return 0    temp = string1 + string1    if (temp.count(string2)> 0):        return 1    else:        return 0n=int(input())s=[]for i in range(n):    s.append(input())for i in range(1,n):    if check(s[0],s[i])==0:        print(-1)        exit()def r(s1, s2):    for i in range(len(s2)):        if s2[i:] + s2[:i] == s1:            return ip=float("inf")for i in range(n):    ans=0    for j in range(n):        if i==j:            continue        else:            ans+=r(s[i],s[j])    p=min(p,ans)print(p)            
