n,m=map(int,input().split())for i in range(m): l=list(map(int,input().split()));d={} for i in l[1:]:  d[i]=d.get(i,0)+1 flag=True for i in d:   if -i in d:flag=False;break if flag:print("YES");exit()print("NO") 