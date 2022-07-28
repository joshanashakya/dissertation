R=lambda:map(int,input().split())x,y,z=R()a,b,c=R()print('YNEOS'[a<x or a-x+b<y or a-x+b-y+c<z::2])
