n=input()s=[]if(len(n)%2==0):    l=len(n)//2else:    l=len(n)//2    l+=1s.append(n[l-1])x=(len(n)-1)-(l-1)# print(s,l)# print(x)for i in range (1,x+1):    s.append(n[(l-1)+i])    if (len(s)==len(n)):        break    s.append(n[(l-1)-i])    if (len(s)==n):        breakfor j in range (len(s)):    print(s[j],end="")  
