n , c = map(int,input().split())l=[]l.extend(map(int,input().split())) c1=1for i in range(n-1):    if l[i+1]-l[i]<= c:        c1+=1    else:        c1=1 print(c1)
