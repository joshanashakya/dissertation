for t in range(int(input())):    a,b,p=map(int,input().split())    s=list(input())    n=len(s)    if(p<a and p<b):        print(n)        continue     dp=[0]*n     st=[]     exc=0     loc=[]    for i in range(n):        if(i==0):            if(s[i]=='A'):                dp[0]=a             else:                dp[0]=b             st.append(s[i])         elif(st[-1]==s[i]):            dp[i]=dp[i-1]+exc            exc=0        else:            loc.append(i)            st.pop(0)            st.append(s[i])            dp[i]=dp[i-1]+exc            if(st[0]=='A'):                exc=a             else:                exc=b     if(dp[-1]<=p):        print(1)        continue     for j in loc:        if(dp[-1]-dp[j]<=p):            print(j+1)            break    else:        print(n)        
