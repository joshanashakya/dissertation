s,a=0,0for _ in" "*int(input()):    t,d=map(str,input().split());t=int(t)    if not a and d[0]!="S"or a==20000and d[0]!="N"or d[0]=="N"and a-t<0 or d[0]=="S"and a+t>20000:s=1    a+=0if d[0] not in"NS"else t if d[0]=="S"else-tprint("YES"if not(s or a)else"NO")
