import matha=int(input())for i in range(a):    n,m=map(int,input().split())    ans=[]    row=[]    for i in range(n):        s=input()        gam=[]        for i in range(len(s)):            gam.append(s[i])        ans.append(gam)        row.append(s.count('.'))    col=[]    for i in range(m):        cnt=0        for j in range(n):            if(ans[j][i]=='.'):                cnt+=1        col.append(cnt)    mini=math.inf      for i in range(n):        for j in range(m):            if(ans[i][j]=='.'):                mini=min(mini,row[i]+col[j]-1)            else:                mini=min(mini,row[i]+col[j])    print(mini)                                                                
