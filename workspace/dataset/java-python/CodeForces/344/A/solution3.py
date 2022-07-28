n=int(input())c=1for i in range(n):    if i==0:        new=input()        continue    old=new    new=input()    if old[1]==new[0]:        c+=1print(c)
