import math, sysfrom

itertools
import permutationsfrom

collections
import defaultdict, dequeimport

bisect as bidef
yes(): print('YES')


def no(): print(
    'NO')  # sys.stdin=open('input.txt','r');sys.stdout=open('output.txt','w');def I():return (int(sys.stdin.readline()))def In():return(map(int,sys.stdin.readline().split()))def Sn():return sys.stdin.readline().strip()#sys.setrecursionlimit(1500)def dict(a):    d={}     for x in a:        if d.get(x,-1)!=-1:            d[x]+=1        else:            d[x]=1    return ddef find_gt(a, x):    'Find leftmost value greater than x'    i = bi.bisect_left(a, x)    if i != len(a):        return i    else:                    return -1def check(l,s):    mul=0    zero=0    for x in s:        if x=='*':            t1= l.pop(0)            t2 = l.pop(0)            if t1==0 or t2==0:                zero+=1            l.append(t1*t2)            mul+=1        else:            t1=l.pop()            t2=l.pop()            if t1==0 or t2==0:                zero+=1            l.append(t1+t2)        l.sort()    if mul and zero:        return(0)    return(l[0]) def main():    try:        l=list(In())        n=len(l)        s=Sn().split()        z=list(permutations(l))        ans=check(l,s)        for x in z:            ans=min(check(list(x),s),ans)        print(ans)      except:        pass        M = 998244353P = 1000000007 if __name__ == '__main__':    # for _ in range(I()):main()    for _ in range(1):main()#End# #        ******************* All The Best *******************   #
