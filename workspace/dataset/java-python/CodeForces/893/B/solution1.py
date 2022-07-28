n = int(input()) i = 0while 1:    base = ('1'*(i+1)) + ('0'*i)    x = int(base , 2)    if x > n: break    if n%x==0:        ans = x     i+=1  print(ans)
