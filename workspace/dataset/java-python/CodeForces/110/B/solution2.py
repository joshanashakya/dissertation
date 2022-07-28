 n = int(input()) x='abcdefghijklmnopqrstuvwxyz'  u=[0]*(n) s =0for j in range(n):    if u[j]==0:        while j<n:            u[j]=x[s]            j+=4        s=(s+1)%26  print(''.join(u))
