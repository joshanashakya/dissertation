l=[]r=[]moves=0open=0closed=0for i in range(int(input())):    a,b=map(int,input().split())    l.append(a)    r.append(b)if l.count(0)>=l.count(1):    moves+=l.count(1)else:    moves+=l.count(0)if r.count(0)>=r.count(1):    moves+=r.count(1)else:    moves+=r.count(0)print(moves)