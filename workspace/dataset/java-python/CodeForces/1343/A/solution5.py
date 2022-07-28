cs=int(input())while cs:    cs-=1    cx=int(input())    for iv in range(2,36):        one=2**iv-1        if cx%one==0:            rt=cx//one            break    print(rt)
