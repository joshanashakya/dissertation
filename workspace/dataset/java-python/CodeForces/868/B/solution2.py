d=list(map(int, input().split()))d[0]*=5d[3]*=5 d[4]*=5t1=d[3]t2=d[4]d.sort()if abs(d.index(t1)-d.index(t2))==1 or abs(d.index(t1)-d.index(t2))==4:    print('YES')else:    print('NO')
