n= int(input()) str1= str(input())ctr = len(str1)for i in range(2,n+1):    strn = str(input())    ans=0    for j in range(ctr):        if str1[j]!=strn[j]:            break        else:            ans+=1    ctr=ans  print(ctr)