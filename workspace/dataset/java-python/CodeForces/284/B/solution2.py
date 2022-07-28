n=int(input())s=input()koli=0kola=0for i in range(n):    if s[i]=='I':        koli+=1    if s[i]=='A':        kola+=1if koli>1:    print(0)    exit()if koli==1:    print(1)    exit()print(kola)
