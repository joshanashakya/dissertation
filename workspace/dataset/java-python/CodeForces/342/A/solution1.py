n=int(input())l=list(map(int,input().split()))if 5 not in l and 7 not in l:    try:        if 2 in l and 4 not in l and 6 not in l: raise Exception        if l.count(1)!=n//3 or l.count(4)>l.count(2): raise Exception        if l.count(3)>l.count(6) or l.count(2)+l.count(3)!=l.count(4)+l.count(6) :raise Exception    except Exception as e:        print(-1)    else:        if l.count(3)!=0:            for j in range(l.count(3)):                print(1,3,6)            for j in range(l.count(6)-l.count(3)):                print(1,2,6)            for j in range(l.count(2)-l.count(6)+l.count(3)):                print(1,2,4)        else:            for j in range(l.count(6)):                print(1,2,6)            for j in range(l.count(2)-l.count(6)):                print(1,2,4)else:print(-1)
