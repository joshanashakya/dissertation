n=int(input())s=input()l=list(s)p=set(l)if(len(s)>26):    print(-1)elif(len(p)<len(l)):    print(len(l)-len(p))else:    print(0)
