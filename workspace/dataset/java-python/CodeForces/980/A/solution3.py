s=input()a=0b=0for x in s:    if(x=="-"):        a=a+1    else:        b=b+1if(b==0):    print("YES")else:    if(a%b==0):        print("YES")    else:        print("NO")
