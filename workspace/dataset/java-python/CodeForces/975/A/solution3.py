n=int(input()) x=list(input().split()) ans=[]for i in range(n):    y=list(x[i].strip())    y.sort()    y=set(y)    y=''.join(y)    if y in ans:        pass    else:        ans.append(y)print(len(ans))
