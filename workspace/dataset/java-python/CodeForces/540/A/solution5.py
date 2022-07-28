n=int(input())s1=input()s2=input()s=0for i in range(n):   m=min(abs(int(s1[i])-int(s2[i])),min(int(s1[i]),10-int(s1[i]))+min(int(s2[i]),10-int(s2[i])))   s=s+mprint(s)
