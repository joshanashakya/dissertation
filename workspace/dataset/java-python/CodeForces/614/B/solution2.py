n=input()x=''zero=0for s in input().split():	if s== '0':print(0),exit()	elif s=='1'+'0'*(len(s)-1):zero+=len(s)-1	else: x=sprint(x+'0'*zero if len(x)>0 else '1'+'0'*zero)	
