a=int(input())x=0for i in range(a):    b=input()    if b=="Tetrahedron":        x+=4    elif b=="Cube":        x+=6    elif b=="Octahedron":        x+=8    elif b=="Dodecahedron":        x+=12    else:        x+=20print(x)
