n=int(input())se=[]def fun(kuro):    global se    le=len(kuro)    dic={}    for i in kuro:        if( i in dic):            dic[i]+=1        else:            dic[i]=1    a1=1    for i in dic:        ma=dic[i]        rest=le-ma        if(rest>=n):            a1=max(ma+n,a1)        elif(n!=1):            a1=max(ma+rest,a1)        else:            if(rest==0):                a1=max(a1,ma-1)            else:                a1=max(a1,ma+1)    se.append(a1)for i in range(3):    fun(input())ma=max(se)if(se.count(ma)!=1):    print('Draw')else:    if(se[0]==ma):        print('Kuro')    elif(se[1]==ma):        print('Shiro')    else:        print('Katie')
