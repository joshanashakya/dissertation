n=input()if n[-1]=='0':    print(n)elif n[-1]<='5':    s=int(n[-1])    n=int(n)    print(n-s)else:    s=10-int(n[-1])    print(int(n)+s)             
