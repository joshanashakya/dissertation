from collections import Counters=input()ss=ss=tuple(list(s))d=Counter(s)res=""res=res+"a"*d['a']res=res+"b"*d['b']res=res+"c"*d['c']if res==ss and d['a']>0 and d['b']>0 and (d['c']==d['a'] or d['c']==d['b']):    print("YES")else:    print("NO")