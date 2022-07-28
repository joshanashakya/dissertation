a,b = map(int, input().split())c=0d=0e=0for i in range(1,7):  if abs(a-i)<abs(b-i):    c+=1  elif abs(a-i)>abs(b-i):    e+=1  else:    d+=1print(c, d, e)
