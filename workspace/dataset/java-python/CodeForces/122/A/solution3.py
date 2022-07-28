n=input()if '4' in n and '7' in n and len(set(n))==2:    print("YES")elif int(n)%4==0 or int(n)%7==0 or int(n)%47==0 or int(n)%74==0 :    print("YES")else:    print("NO")
