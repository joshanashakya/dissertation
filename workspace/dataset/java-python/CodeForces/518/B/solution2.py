s=input()t=input() from collections import Counter as Cimport stringlower=string.ascii_lowercaseupper=string.ascii_uppercase cS=C(s)cT=C(t) yay=0whoops=0for c,cnt in cS.items():    if c in cT.keys():        subtract=min(cnt,cT[c])        yay+=subtract        cS[c]-=subtract        cT[c]-=subtract        for c,cnt in cS.items():    if cnt==0:        continue    if c in lower:        c2=c.upper()    else:        c2=c.lower()    if c2 in cT.keys():        subtract=min(cnt,cT[c2])        whoops+=subtract        cS[c]-=subtract        cT[c2]-=subtractprint('{} {}'.format(yay,whoops))
