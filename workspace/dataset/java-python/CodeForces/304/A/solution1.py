import mathn=int(input())cnt=0for i in range(1,n):    for j in range(1,i+1):        c2=int((i*i)+(j*j))        #print("c2={}".format(c2))        c=int(math.sqrt(c2))        #print("c={}".format(c))        if c<=n and (i*i)+(j*j)==int(c*c):            cnt+=1            #print(c)print(cnt)