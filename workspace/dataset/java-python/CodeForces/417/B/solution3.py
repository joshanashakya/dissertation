a=[]d={}flag=0for t in range(int(input())):    x,y=map(int,input().split())    if y in d.keys():        if x==0 and len(d[y])==0:            d[y].append(x)        if d[y][len(d[y])-1]+1==x:            d[y].append(x)        elif x<=d[y][len(d[y])-1]:            continue        else:            flag=1            break    else:        d[y]=[]        if x!=0:            flag=1            break        else:            d[y].append(0) if flag==0:    print("YES")else:    print("NO")   
