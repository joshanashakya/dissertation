import sysimport bisectdef gcd(a, b):	if (a == 0):		return b        	return gcd(b % a, a)def input():    return sys.stdin.readline().strip()def iinput():   return int(input())def minput():   return map(int, input().split()) def listinput(): return list(map(str, input().split()))for _ in range(iinput()):	L,v,l,r=minput()	print(L//v+(l-1)//v-r//v)