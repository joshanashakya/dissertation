s=input()t=input()alp=[]countalp=[]salp=[]scountalp=[]yay=0woops=0 for i,x in enumerate(s):        if x not in alp:        alp.append(x)        n=s.count(x)        countalp.append(n)for i,x in enumerate(t):        if x not in salp:        salp.append(x)        n=t.count(x)        scountalp.append(n)for b,y in enumerate(alp):    tcount=t.count(y)    if tcount>0:        if abs(countalp[b]-tcount)==0:            yay+=tcount            # print("prev 1",y,scountalp[salp.index(y)],countalp[b])            scountalp[salp.index(y)]-=tcount            countalp[b]-=tcount            # print("next",y,scountalp[salp.index(y)],countalp[b])                                else:            yay+=min(countalp[b],tcount)            if (countalp[b]-tcount)<0:                # print("prev 2",y,scountalp[salp.index(y)],countalp[b])                                scountalp[salp.index(y)]-=countalp[b]                countalp[b]=0                # print("next",y,scountalp[salp.index(y)],countalp[b])            else:                # print("prev 3",y,scountalp[salp.index(y)],countalp[b])                countalp[b]-=tcount                scountalp[salp.index(y)]=0                # print("next",y,scountalp[salp.index(y)],countalp[b])                        for k,z in enumerate(alp):    if (z.swapcase() in salp) and countalp[k]>0 and scountalp[salp.index(z.swapcase())]>0 :        woops+=min(scountalp[salp.index(z.swapcase())],countalp[k])        # if scountalp[salp.index(z.swapcase())]<=countalp[k]:        #     woops+=scountalp[salp.index(z.swapcase())]        # else:        #     woops+=countalp[k]# print(alp,countalp)# print(salp,scountalp)print(yay,woops)                    
