i=input()i+="$"current=i[0]mapped=[]c=0ris=0 for x in i:    if x==current:        c+=1    else:        mapped.append((c,current))        current=x        c=1n=len(mapped)if n%2==0:    print(0)elif mapped[n//2][0]<2:    print(0)else:    for x in range((n//2)+1):        if mapped[x][0]+mapped[n-x-1][0]<3 or mapped[x][1]!=mapped[n-x-1][1]:            print(0)            break    else:        print(mapped[n//2][0]+1)