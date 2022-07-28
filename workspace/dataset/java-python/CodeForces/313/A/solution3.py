n=int(input())a=abs(n)%10b=abs(n)//10%10if n>0:    print(n)elif a>b:    print(int(str(n)[0:-1]))else:    n=str(n)    print(int(n[0:-2]+n[-1]))
