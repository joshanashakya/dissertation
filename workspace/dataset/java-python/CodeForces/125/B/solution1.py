s=input()s1=s.split('<')# print(s1)del s1[0]# print(s1)x=0for i in s1:    if "/" in i:        print("  "*(x-1),"<",i,sep="")        x-=1    else:        print('  ' * x, '<',i,sep="")        x += 1
