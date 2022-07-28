n, m, a=input().split()n=int(n)m=int(m)a=int(a)s=0c=0if n%a==0:    s=n//a else:    s=n//a+1 if m%a==0:    c=m//aelse:    c=m//a+1 print(c*s)
