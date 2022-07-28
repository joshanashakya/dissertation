# A. Floor Numberimport matht= int(input())for i in range(t):    n,x=map(int,input().split())    if n<=2:        print(1)    else:        c=math.ceil((n-2)/x)+1        print(c)
