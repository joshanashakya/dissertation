 from collections import Counters = list(input())t = list(input()) d1 = {}d2 = {} ans1 , ans2 = 0 , 0 c1 = Counter(s)c2 = Counter(t) for i in c1 :    if i in c2:        x = min(c1[i] , c2[i])        c1[i] -= x        c2[i] -= x        ans1 += x for i in c1 :    if ord(i) <= 90 :        y = chr(ord(i) + 32)        if y in c2 :            ans2 += min(c1[i] , c2[y])     else:        y = chr(ord(i) - 32)        if y in c2 :            ans2 += min(c1[i] , c2[y]) print(ans1 , ans2) 
