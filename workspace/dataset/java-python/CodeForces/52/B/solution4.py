n,m=map(int,input().split())c,r=[0]*n,[0]*mvals=[]for i in range(n):    s=input()    vals.append(s)    for j in range(m):        if(s[j]=='*'):            c[i]+=1            r[j]+=1ans=0for i in range(n):    for j in range(m):        if(vals[i][j]=='*'):            ans+=(c[i]-1)*(r[j]-1)print(ans)