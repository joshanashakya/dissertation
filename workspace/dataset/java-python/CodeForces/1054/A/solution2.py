x,y,z,t1,t2,t3=map(int,input().split())st=abs(y-x)*t1 et=abs(z-x)*t2+abs(x-y)*t2+3*t3 print('YES' if et<=st else 'NO') 
