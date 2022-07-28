l=list( list(map(int,input().split())) for _ in range(int(input())))x=min(i[0] for i in l)y=max(i[1] for i in l)if [x,y] in l:print(l.index([x,y])+1)else:print("-1")
