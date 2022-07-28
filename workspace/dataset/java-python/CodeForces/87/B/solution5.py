from collections import *
import sys, relines = [i[:-1] for i in sys.stdin.readlines()]
n = int(lines[0])
lines = lines[1:]
typeof = defaultdict(lambda: 'errtype')
typeof['void'] = 'void'


def simplify(s):    global typeof


l, r = s.count('&'), s.count('*')
result = typeof[s[l:len(
    s) - r]]  # print(l,r,result,s[l:len(s)-r])	if(result == 'errtype'):		return result	for i in range(r):		result = result+'*'	for i in range(l):		if(result[-1] == '*'):			result = result[:-1]		else:			return 'errtype'	return result#print(simplify('void*'))typeof['ptv'] = simplify('void*')#print(typeof['ptv'])#print(simplify('ptv'))#exit()for line in lines:	commands = line.split()	if(commands[0] == 'typeof'):		print(simplify(commands[1]))	else:		typeof[commands[2]] = simplify(commands[1])#print(typeof['ptv'])
