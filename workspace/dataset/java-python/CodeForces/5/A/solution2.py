import sysimport bisectdef gcd(a, b):	if (a == 0):		return b        	return gcd(b % a, a)def input():    return sys.stdin.readline().strip()def iinput():   return int(input())def minput():   return map(int, input().split()) def listinput(): return list(map(str, input().split()))peeps,tra=0,0for i in sys.stdin:		if i[0]=='+':		peeps+=1	elif i[0]=='-':		peeps-=1	else:		tra+=(len(i)-2-i.find(':'))*peepsprint(tra)