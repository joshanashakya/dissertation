s=input()a,ab,aba=0,0,0for i in s:    if i=='a':        a+=1        aba=max(ab,aba)+1    else:        ab=max(a,ab)+1print(max(aba,ab,a))
