def max3(a,b,c):    if max(b,c)==b:        if max(a,b)==a:            return a        else:            return b    else:        if max(a,c)==a:            return a        else:            return cdef garland(a,b,c):    first=max3(a,b,c)    if first==a:        second=max(b,c)        third=min(b,c)    elif first==b:        second=max(a,c)        third=min(a,c)    else:        second=max(a,b)        third=min(a,b)    if first>second+third+1:        return 'No'    else:        return 'Yes'x=int(input())m=[]for i in range(x):    y=input()    z=y.split(' ')    k=[int(t) for t in z]    m.append(k)for j in range(x):    print(garland(m[j][0],m[j][1],m[j][2]))
