n=input()s=''for i in n:    x=int(i)    if x>4:        s=s+str(9-x)    else:        s=s+str(x)if s[0]=='0':    print('9'+s[1:])else:    print(s)
