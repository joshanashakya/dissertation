def o(s,x):    d=s-x    if x<<1 & d or d%2 or d<0: return 0    return 2**(bin(x).count('1'))-(0 if d else 2)s,x=map(int,input().split())print(o(s,x))
