n = int(input())s = input().replace(' ','')f = Falsea = b = 0for chr in s.replace('(',')').split(')'):    for i in chr.split('_'):        if f:            b += len(i) != 0        else:            a = max(a,len(i))    f = not fprint(a, b) 
