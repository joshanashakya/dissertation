n=int(input())a=list(map(int,input().split()))d={} for i in range(n):    if str(a[i]) not in d:        d[str(a[i])]=[1,i,i]    else:        d[str(a[i])][0]+=1        d[str(a[i])][2]=max(d[str(a[i])][2],i) res = sorted(d, key = lambda x: d[x][0],reverse=True)maxx=d[res[0]][0]ans=float('inf')for i in range(len(res)):    if d[res[i]][0]<maxx:        break    if ans>d[res[i]][2]-d[res[i]][1]:        ans=d[res[i]][2]-d[res[i]][1]        ind=[d[res[i]][1]+1,d[res[i]][2]+1]    print(*ind)
