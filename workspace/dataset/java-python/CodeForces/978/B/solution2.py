n=int(input())s=input()c=0for i in range(n-2):    if s[i]=='x' and s[i+1]=='x' and s[i+2]=='x':        c+=1print(c)
