import sys# sys.stdin=open('input.txt','r')# sys.stdout=open('output.txt','w')# import sysimport mathdef input(): return sys.stdin.readline().strip("\n")def I():    return (input())def II():    return (int(input()))def MI():    return (map(int,input().split()))def LI():    return (list(map(int,input().split())))def check(s):     for i in range(len(s) - 1):         if (abs(ord(s[i]) - ord(s[i + 1])) == 1):             return 0    return 1for _ in range(II()):	s=I()	o = ""	e = "" 	for i in range(len(s)): 	    if ord(s[i]) % 2 == 0: 	        e += s[i] 	    else: 	        o += s[i] 	o = sorted(o) 	e = sorted(e)  	if (check(o + e)): 	    print("".join(o + e)) 	elif (check(e + o)): 	    print("".join(e + o)) 	else: 	    print("No answer") 