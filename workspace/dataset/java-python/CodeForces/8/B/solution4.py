a=input()b=[[0,0]]x=0y=0z=1for i in range(len(a)):    if a[i]=='R':        x+=1        if [x,y] in b or [x+1,y] in b or [x,y+1] in b or [x,y-1] in b:            z=0            break    if a[i]=='L':        x-=1        if [x,y] in b or [x-1,y] in b or [x,y+1] in b or [x,y-1] in b:            z=0            break    if a[i]=='U':        y+=1        if [x,y] in b or [x+1,y] in b or [x,y+1] in b or [x-1,y] in b:            z=0            break    if a[i]=='D':        y-=1        if [x,y] in b or [x+1,y] in b or [x-1,y] in b or [x,y-1] in b:            z=0            break    b.append([x,y])if z==1:    print('OK')else:    print('BUG')