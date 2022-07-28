a,b=[int(x) for x in input().split()] x=b%10mul=1for i in range(b,a,-1):    mul*=x    x-=1    if x<0 and i>a:        print("0")        mul=-1        breakif mul!=-1:    mul=mul%10    print(mul)
