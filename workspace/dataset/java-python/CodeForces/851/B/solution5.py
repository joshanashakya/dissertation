from math import sqrtdef distance(x1,y1,x2,y2):    return  (x1-x2)**2 + (y1-y2)**2 a,b,x,y,c,d=[int(element) for element in input().split(" ")] if distance(x,y,a,b)==distance(x,y,c,d) and ((b-y)*(x-c)-(y-d)*(a-x))!=0:    print("YES")else:    print("NO")