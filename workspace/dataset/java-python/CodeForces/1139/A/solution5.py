n=int(input())s=input()l=[]c=0ans=0for i in range(n):    if( int(s[i])%2==0):        c+=1        l.append(i)# print(l)for i in range (len(l)):    ans=ans + (l[i] +1)print(ans)   
