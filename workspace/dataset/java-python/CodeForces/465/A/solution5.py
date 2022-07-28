n = int(input())s = str(input()) y = s[::-1]t = 0j = 1for i in range(n):  if y[n-j] == '1':    t+=1    j+=1  else:    print(t+1)    exit()    print(t)
