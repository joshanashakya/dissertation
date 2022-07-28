n,m=map(int,input().split())z=0for i in range(n):    l=input().split()    if('C' in l or 'M' in l or 'Y' in l):        z=1        break if(z==0):    print("#Black&White")else:print("#Color")
