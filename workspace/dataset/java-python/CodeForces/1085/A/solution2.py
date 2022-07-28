s=input()n=len(s)a=""while(n!=0):    if (n%2==0):        a+=s[-1]        s=s[:-1]        n-=1    else:        a+=s[0]        s=s[1:]        n-=1 print(a[::-1])
