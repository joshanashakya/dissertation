a, b = map(int,input().split())d = [6,2,5,5,4,5,6,3,7,6]pas = 0for i in range(a,b+1):    for k in (str(i)):        pas += d[int(k)]print(pas)    
