n = int(input())m = int(input()) l =[int(input()) for i in range(n)] l.sort(reverse=True) tot= 0c=0i=0while m>0:    m-=l[i]    i+=1    c+=1print(c)
