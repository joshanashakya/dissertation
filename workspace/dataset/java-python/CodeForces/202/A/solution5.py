s=str(input())l=[]for i in s:    if i not in l:        l.append(i)l.sort()char=l[len(l)-1]h=s.count(char)string=""for i in range(h):    string=string+charprint(string)
