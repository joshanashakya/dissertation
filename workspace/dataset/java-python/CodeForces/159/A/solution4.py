l=input().split()n=int(l[0])d=int(l[1])lfi=[]lofpairs=[]for you in range(n):    s=input().split()    for i in lfi:        if(s[0]==i[1] and s[1]==i[0]):            if(int(s[2])-int(i[2])<=d and int(s[2])-int(i[2])!=0):                if((i[0],i[1]) not in lofpairs and (i[1],i[0]) not in lofpairs):                    lofpairs.append((i[0],i[1]))    lfi.append(s)print(len(lofpairs))for i in lofpairs:    print(i[0],i[1])
