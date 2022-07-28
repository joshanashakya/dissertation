a = input().upper() + " "v = ['A','E','I','O','U','Y']m=0c=0for i in range(len(a)):    c+=1    if(a[i] in v or a[i]==" "):        if(c>m):            m=c        c=0print(m)        
