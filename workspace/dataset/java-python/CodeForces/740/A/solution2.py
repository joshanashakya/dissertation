a, b, c, d=map(int, input().split())s=a%4h=0 if s==3:    h=min(b,3*d,c+d)elif s==2:    h=min(2*b,c,2*d)elif s==1:    h=min(3*b,c+b,d)print(h)
