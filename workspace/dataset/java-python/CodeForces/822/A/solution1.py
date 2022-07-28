def fact(x): 	if(x==1): return(1)	else: return(fact(x-1)*x)a,b=[int(x) for x in input().split(' ')]print(fact(min(a,b)))
