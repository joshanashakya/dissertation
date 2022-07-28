n=int(input())s=input()if s.count('8')==0:    print(0)elif len(s)<11:    print(0)else:    x=n//11    y=s.count('8')    if x<=y:        print(x)    else:        print(y)
