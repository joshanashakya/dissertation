import math,sys#from itertools import permutations, combinations;import heapq,random;from collections import defaultdict,dequeimport bisect as bidef yes():print('YES')def no():print('NO')def I():return (int(sys.stdin.readline()))def In():return(map(int,sys.stdin.readline().split()))def Sn():return sys.stdin.readline().strip()#sys.setrecursionlimit(1500)def dict(a):    d={}     for x in a:        if d.get(x,-1)!=-1:            d[x]+=1        else:            d[x]=1    return ddef find_gt(a, x):    'Find leftmost value greater than x'    i = bi.bisect_left(a, x)    if i != len(a):        return i    else:                    return -1        def main():    try:        x,y,a,b=In()        z=(x*y)//math.gcd(x,y)        t=math.floor(b/z)-math.ceil(a/z)        print(t+1)    except:        pass        M = 998244353P = 1000000007 if __name__ == '__main__':    # for _ in range(I()):main()    for _ in range(1):main()#        *******************    All The Best    *******************   #