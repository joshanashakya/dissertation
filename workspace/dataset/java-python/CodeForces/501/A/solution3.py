a,b,c,d=map(int,input().split())misha=max(3*a/10,a-(a/250)*c)vasya=max(3*b/10,b-(b/250)*d) if vasya>misha:	print("Vasya")if misha>vasya:	print("Misha")if misha==vasya:	print("Tie")
