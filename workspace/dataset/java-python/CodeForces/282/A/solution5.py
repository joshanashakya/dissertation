n = int(input())count=0while(n>0):    n-=1    strr = str(input())    if('--' in strr):        count-=1    else:        count+=1print(count)
