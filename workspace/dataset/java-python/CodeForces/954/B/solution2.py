 n=int(input())st=input()i=n//2-1;j=0for j in range(i,-1,-1):    if st[0:j+1]==st[j+1:2*j+2]:breakprint(n-j)
