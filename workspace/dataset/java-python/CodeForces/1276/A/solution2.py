t=int(input())for _ in range(t):  s=list(input())  n=len(s)  l=[]  for i in range(n-4):    if "".join(s[i:i+5])=="twone":      s[i+2]="A"      l.append(i+2+1)  for i in range(n-2):    if "".join(s[i:i+3])=="one":      s[i+1]="B"      l.append(i+1+1)    if "".join(s[i:i+3])=="two":      s[i+1]="C"      l.append(i+1+1)  print(len(l))  print(*l)
