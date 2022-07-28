for s in[*open(0)][2::2]:i=s.find('1')%len(s);j=s.rfind('0');print(s[:i]+'0'*(j>i)+s[j+1:])
