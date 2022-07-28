k,b,n,t = [int(x) for x in input().split(" ")]z = 1while k*z+b<=t:    z = k*z+b    n -= 1print(max(n,0))
