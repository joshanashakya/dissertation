c=0for i in range(int(input())):    s=input()    a=s.split(" ")    if(int(a[1])>=2400):        if(int(a[2])>int(a[1])):            c=1            breakif(c==0):    print("NO")else:    print("YES")
