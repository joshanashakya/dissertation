a,b = map(int,input().split())first = 0second = 0draw = 0for i in range(1,7):    if abs(a-i)>abs(b-i):        second+=1    elif abs(a-i)<abs(b-i):        first+=1    else:        draw+=1print(first,draw,second)