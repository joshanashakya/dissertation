def solution(s):    s=sorted(s,reverse=True)    n=len(s)    ans=s[0]    for i in range(1,n):        if(s[i-1]==s[i]):            ans+=(s[i])        else:            return ans    return ans s=input()print(solution(s))