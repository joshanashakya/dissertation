a,b = map(int,input().split())count = 0q,e = 0,0i = 1flag = 0 while(q!=a or e!=b):    for j in range(i):        q+=1        if(q==a and e==b):            flag = 1            break    if(flag):        break    count+=1    for j in range(i):        e+=1        if(q==a and e==b):            flag = 1            break    i+=1    if(flag):        break    count+=1    for j in range(i):        q-=1        if(q==a and e==b):            flag = 1            break    if(flag):        break    count+=1    for j in range(i):        e-=1        if(q==a and e==b):            flag = 1            break    if(flag):        break    i+=1    count+=1print(count)
