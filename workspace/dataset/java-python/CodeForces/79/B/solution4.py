n, m, k, t = map(int, input().split())
waste = [tuple(map(int, input().split())) for _ in range(
    k)]  # def getCount(waste,q1,q2):#     count=0#     for i in range(1,q1):#         for j in range(1,m+1):#             if (i,j) in waste:#                 count=count+1#     for j in range(1,q2):#         if (q1,j) in waste:#             count=count+1#     return count    def getCount2(waste,q1,q2):    count=0    for index,val in enumerate(waste):        if val[0]<q1 and val[1]<=m:            count=count+1        elif val[0]==q1 and val[1]<q2:            count=count+1        else:            pass    return count##### answer queriesfor q in range(t):    q1,q2=map(int,input().split())    I=((q1-1)*m)+(q2-1)    J=getCount2(waste,q1,q2)    a=(I-J)%3    if (q1,q2) in waste:        print("Waste")    elif a==0:        print("Carrots")    elif a==1:        print("Kiwis")    else:        print("Grapes")        # 525 17 1# Kiwis# 35 2 0# Carrots# 908 30 2# Grapes# 113 3 2# Grapes
