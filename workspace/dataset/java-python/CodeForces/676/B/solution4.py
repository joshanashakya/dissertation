n,t=list(map(int,input().split()))li=[[t-1]]cnt=1 if t-1>=0 else 0for i in range(2,n+1):    tr=li[-1][0]/2-1    if tr>=0:        cnt+=2    li.append([tr])    for j in range(1,i-1):        a=li[-2][j-1]        b=li[-2][j]        temp=-1        if a >0 :            temp+=a/2        if b>0:            temp+=b/2        if temp>=0:            cnt+=1        li[-1].append(temp)    li[-1].append(tr)print(cnt)
