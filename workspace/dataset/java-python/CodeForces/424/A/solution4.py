n=input()s=input()X=s.count('X')x=s.count('x')c=abs((X-x)//2)print(c)if X>x:    s=s.replace('X','x',c)else:    s=s.replace('x','X',c)print(s)
