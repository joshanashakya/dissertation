def f(s):	if(len(s) == 1):		return [int(s[0]),s]	if(s[0] == "0"):		return [f(s[1:])[0], "0"+f(s[1:])[1]]	a = [f(s[1:])[0]+int(s[0]),s[0]+f(s[1:])[1]]	b = [int(s[0])+9*len(s)-10,str(int(s[0])-1)+(len(s)-1)*"9"]	return max(a,b) n = input()print(int(f(n)[1]))