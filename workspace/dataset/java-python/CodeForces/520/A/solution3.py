n=int(input())s=input()l=[]for i in s:    k=i.lower()    if k not in l:        l.append(k)if(len(l)==26):    print("YES")else:    print("NO")
