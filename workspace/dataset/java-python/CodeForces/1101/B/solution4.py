r=list("[::]") s=str(input())r=["[",":"]left=-1for i in range(0,len(s)-2):    if s[i]==r[0]:        del(r[0])        if r==[]:            left=i            breakif left!=-1:    r=["]",":"]    right=-1    for i in range(len(s)-1,left,-1):        if s[i]==r[0]:            del(r[0])            if r==[]:                right=i                break    if right!=-1:        bb=0        for i in range(left+1,right):            if s[i]=="|":                bb+=1          print(4+bb)    else:        print(-1)else:    print(-1)        #