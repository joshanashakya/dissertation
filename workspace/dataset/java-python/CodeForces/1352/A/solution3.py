t=int(input())for x in range(t):	n=input()	print(len(n)-n.count("0"))	for x in range(len(n)):		if n[x]!="0":			print(n[x]+"0"*(len(n)-(x+1)),end=" ")	print()
