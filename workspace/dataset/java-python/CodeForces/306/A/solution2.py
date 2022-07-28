n,m = input().split()n = int(n)m = int(m)q = n//mr = n%mlst = []for i in range(m):    if(i<m-r):        lst.append(q)    else:        lst.append(q+1)print(*lst)
