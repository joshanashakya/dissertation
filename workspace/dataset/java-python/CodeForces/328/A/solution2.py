 a,b,c,d = list(map(int,input().split())) a1 = b - aa2 = c - ba3 = d - c g1 = b / ag2 = c / bg3 = d / c#print(g1 , g2 , g3)#print(a1 , a2 , a3) if a1 == a2 == a3 :    res = d + a1    print(res)  elif g1 == g2 == g3 and d * g1 == int(d*g1) :    res = g1 * d    print(int(res)) else:    print(42) 