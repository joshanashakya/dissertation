n,s=map(int,input().split(" "))ans=-1for _ in range(n):    a,b=map(int,input().split(" "))    if a<s:        if (b!=0):            ans=max(ans,100-b)    if a<=s and b==0:        ans=max(ans,0)print(ans)