 a = int(input())b = int(input())   n = a+b+1t=[]  for k in range(1,n+1):    t.append(k) print(*(t[:a]+t[a:][::-1]))    
