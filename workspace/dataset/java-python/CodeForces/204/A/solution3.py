def calc(r):    if r<10:        return r    ret,l=r//10+9,len(str(r))    if r%10 < r//10**(l-1):        ret-=1    return ret l,r=map(int,input().split())print(calc(r) -calc(l-1))
