s=input().split()n=int(s[0])m=int(s[1])if (n>m):    a=n    n=m    m=aif (n==1):    print(m)elif (n==2):    if (m%4<=2):        print(m+m%4)    else:         print(m+1)else:    print((n*m+1)//2)
