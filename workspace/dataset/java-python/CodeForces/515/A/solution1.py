a,b,c=map(int,input().split())if abs(a)+abs(b)<=c :    if (c-(abs(a)+abs(b)))%2==0 :        print('Yes')    else:        print("No")else :    print("No")
