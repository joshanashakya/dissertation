import math,sys#from itertools import permutations, combinations;import heapq,random;from collections import defaultdict,dequeimport bisect as bidef yes():print('YES')def no():print('NO')#sys.stdin=open('input.txt','r');sys.stdout=open('output.txt','w');def I():return (int(sys.stdin.readline()))def In():return(map(int,sys.stdin.readline().split()))def Sn():return sys.stdin.readline().strip()#sys.setrecursionlimit(1500)def dict(a):    d={}     for x in a:        if d.get(x,-1)!=-1:            d[x]+=1        else:            d[x]=1    return ddef find_gt(a, x):    'Find leftmost value greater than x'    i = bi.bisect_left(a, x)    if i != len(a):        return i    else:                    return -1def main():    try:        n=I()        s=Sn()        l = []        z = 0        o = 0        d = {}        d[0] = -1        for i in range(n):            if(s[i] == '0'):                z+=1            else:                o+=1            l.append(z-o)        ans = 0        for i in range(n):            if(l[i] not in d):                d[l[i]] = i                     else:                ans = max(ans, i-d[l[i]])                 print(ans)    except:        pass        M = 998244353P = 1000000007 if __name__ == '__main__':    # for _ in range(I()):main()    for _ in range(1):main()#End# #        ******************* All The Best *******************   # 	 	 	      			 		 		 	       	
