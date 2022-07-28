s=str(input())l=['Danil','Olya','Slava','Ann','Nikita']c,c1=0,0for i in l:    if i in s:        c=s.count(i)        c1+=1 if c==1 and c1==1:    print("YES")else:    print("NO")
