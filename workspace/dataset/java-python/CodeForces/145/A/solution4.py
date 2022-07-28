a = list(map(int,input()))b= list(map(int,input()))c = 0; z = 0for i in range(len(a)):    if a[i]!=b[i]:        if a[i]==4:            c+=1        else:            z+=1print(max(c,z)) 
