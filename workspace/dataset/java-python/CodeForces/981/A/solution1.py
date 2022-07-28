s=input()c=len(s)for i in range(len(s)-1,0,-1):    k=s[0:i+1]    if(k!=k[::-1]):        print(c)        exit()    c-=1if(c==1):    print("0")
