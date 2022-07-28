I=lambda:map(int,input().split())n,t=I()a=*I(),x=0while x<t-1:x+=a[x]print('YNEOS'[x>=t::2])
