import sysinput=sys.stdin.buffer.readline    def check(x):    visited=[0 for i in range(n+1)]    count=0    for i in range(1,m):        if(a[i][0]!=x and a[i][1]!=x):            count+=1            visited[a[i][0]]+=1            visited[a[i][1]]+=1    if(max(visited)==count):        return 1    else:        return 0 n,m=map(int,input().split())a=[]for i in range(m):    k,l=map(int,input().split())    a.append([k,l])if(check(a[0][0])+check(a[0][1])>0):    print("YES")else:    print("NO")
