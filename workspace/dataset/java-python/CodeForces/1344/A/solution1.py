import sysinput=sys.stdin.readlinet=int(input())for you in range(t):    n=int(input())    l=input().split()    li=[int(i) for i in l]    hashi=dict()    for i in range(n):        z=i+li[i]        if z%n in hashi:            hashi[z%n]+=1        else:            hashi[z%n]=1    poss=1    for i in hashi:        if(hashi[i]>1):            poss=0            break    if(poss):        print("Yes")    else:        print("No")