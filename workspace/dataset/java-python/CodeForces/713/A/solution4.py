t=str.maketrans("0123456789","0101010101")dct={}for _ in range(int(input())):    q,a=input().split()    if(q=="+"):        c=int(a.translate(t))        try:            dct[c]+=1        except:            dct[c]=1    elif(q=="-"):        c=int(a.translate(t))        try:            dct[c] -= 1        except:            dct[c] = 1    else:        c=int(a.translate(t))        try:            print(dct[c])        except:            print(0)