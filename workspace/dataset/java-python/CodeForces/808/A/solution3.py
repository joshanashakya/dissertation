n=int(input())l=0tmp=nwhile n>0:    r=n%10    n=n//10    l+=1if tmp<10:    print(1)else:    print((r+1)*(10**(l-1))-tmp)
