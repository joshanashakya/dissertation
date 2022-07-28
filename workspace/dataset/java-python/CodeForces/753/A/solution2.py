n = int(input())i = 1a =[]while n>=i:    a.append(i)    n-=i    i+=1if n > 0:    a[-1]+=nprint(len(a))print(*a)
