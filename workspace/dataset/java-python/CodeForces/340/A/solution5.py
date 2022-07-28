  x,y,a,b = map(int,input().split())u=0import math  f = math.gcd(x,y)lcm = x*y//f print(b//lcm - (a-1)//lcm)
