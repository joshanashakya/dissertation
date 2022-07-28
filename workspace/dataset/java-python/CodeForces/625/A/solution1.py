I=lambda:int(input())n,a,b,c=I(),I(),I(),I()d,l=b-c,max(n-c,0)print(max(l//d+(l%d+c*(n>=b))//a,n//a+max(0,n%a-c)//d))
