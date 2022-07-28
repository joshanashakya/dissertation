 n=int(input())a=input()flag=0 for i in range(n):    if(a[i]=='0'):        print(i+1)        flag=1        breakif(flag==0):    print(n)
