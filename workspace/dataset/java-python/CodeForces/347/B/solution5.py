n=int(input())li=list(map(int,input().split(" "))) indexes=[0]*n i=0while i<len(li):    indexes[li[i]]=i    i+=1 swapped=Falseallequal=Truei=0count=0while i<len(li):    if li[i]==i:        count+=1    else:        allequal=False        if swapped==False:            if indexes[i]==li[i]:                                count+=2                swapped=True    i+=1if swapped==False and allequal==False:    count+=1print(count)
