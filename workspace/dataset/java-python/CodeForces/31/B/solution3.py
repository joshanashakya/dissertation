s=input().split('@')              n=len(s) - 1                      for i in range(1,n):              	if len(s[i])<2:               		s=False                   		break                     	s[i]=s[i][0]+','+s[i][1:]     if n>0 and s and s[0] and s[n]:   	print('@'.join(s))            else:                             	print('No solution')                                            
