def check(ss):    tmp=0    for i in range(len(u)):        tmp+=ss[i]!=u[i]    return tmp     s = input()u = input()s = '#'*2000 + s + '#'*2000ans=1000000000000for i in range(len(s)-len(u)):    sub = s[i:i+len(u)]    ans = min(ans , check(sub))print(ans)     
