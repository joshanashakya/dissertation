n,a,b=list(map(int,input().split()))s=list(map(int,input().split()))ans=0for i in range(n):    if s[i]==2:        if s[n-1-i]==2:            ans=ans+min(a,b)        elif s[n-1-i]==0:            ans=ans+a        else:            ans=ans+b    else:        if s[n-1-i]!=2 and s[n-1-i]!=s[i]:            print("-1")            exit()print(ans)
