 n=int(input())s=['o']*na=b=c=1while a<=n:  s[a-1]='O'  c=a  a=b  b=a+cprint(''.join(s))
