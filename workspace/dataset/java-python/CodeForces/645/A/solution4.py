a=input()+input()[::-1]b=input()+input()[::-1]a=a.replace("X","")b=b.replace("X","")if (a+a).find(b)+1:print("YES")else:print('NO')
