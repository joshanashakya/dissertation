r,g,b = map(int,input().split())if  {r%3,g%3,b%3} == {0,1,2} or 0 in {r,g,b}:	print((r//3+g//3+b//3))else:	print((r+b+g)//3)
