a,b,c = map(int, input().split())if (a!=b and c==0):	print ("NO")else:	print ("YES") if (a==b or ((b-a)%c==0 and (abs(b-a)/abs(c))==((b-a)/c))) else print ("NO")
