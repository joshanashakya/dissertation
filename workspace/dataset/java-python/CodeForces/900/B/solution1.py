import sysdef input():    return sys.stdin.readline().strip()def iinput():   return int(input())def minput():   return map(int, input().split()) def listinput(): return list(map(int, input().split()))a,b,pos=minput()for i in range(b):	a*=10	c=a//b	a=a%b	if c==pos:		print(i+1)		exit()print("-1")
