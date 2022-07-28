from math import pid,h,v,e = list(map(int, input().split()))a = (d**2 / 4)*pi*hve = (d**2 / 4)*pi*eif (v > ve):    print("YES")    print(a / (v - ve))else:    print("NO")
