n=int(input()) if n%2==0:    print(n//2)    for i in range(n//2):        print(2)elif n%2!=0:    print( (n-1)//2 )    m=[2]*((n-1)//2)    m[-1] = 3    print(' '.join(str(x) for x in m))           
