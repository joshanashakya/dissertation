n,m=(int(x) for x in input().split())ans=2*n-m-1for i in range(m):    a=[int(x) for x in input().split()]    for j in range(1,a[0]):        if a[j+1]==j+1 and a[j]==j:ans-=2        else:breakprint(ans)
