n,a,q,w,r=int(input()),list(map(int,input().split())),[],[],[0]for i in range(n):q.append([a[i],i+1])q.sort()for i in range(1,n):    if q[i][0]==q[i-1][0]:r[0]+=1;r.append(i+1)    if r[0]==2:breakfor i in q:w.append(i[1])if r[0]==2:    print("YES")    print(*w)    for i in range(1,3):w[r[i]-1],w[r[i]-2]=w[r[i]-2],w[r[i]-1];print(*w)else:print("NO")
