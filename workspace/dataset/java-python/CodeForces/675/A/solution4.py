a,b,c=map(int,input().split());s=0if c==0 :    if a==b :        print("YES")    else :        print("NO")elif c<0 :    if a<b :        print("NO")    else :        if abs(a-b)%c==0 :            print("YES")        else :            print("NO")else :    if a>b :        print("NO")    else :        if abs(a-b)%c==0 :            print("YES")        else :            print("NO")
