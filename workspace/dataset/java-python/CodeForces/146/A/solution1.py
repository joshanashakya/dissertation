n=int(input())t=list(input())A=0B=0r=1for i in t:    if int(i) != 7 and int(i) != 4:        r=0        if r>0:    i=(int(n/2))-1    j=int(n/2)     while i>=0:        A=A+int(t[i])        B=B+int(t[j])        i-=1        j+=1if r==1 and A==B:    print("YES")else:    print("NO")