import sysimport mathdef input():    return sys.stdin.readline().strip()def iinput():   return int(input())def minput():   return map(int, input().split()) def listinput(): return list(map(int, input().split()))n=iinput()l=listinput()temp=0for i in range(0,int(n/2)):	if i%2==0:		temp=l[i]		l[i]=l[n-i-1]		l[n-i-1]=tempprint(*l)