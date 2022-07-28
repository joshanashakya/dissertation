s=open('input.txt').readlines()[1];n=len(s)//2for i in range(n):print(*[i+1+n,i+1][::2*(s[i]>'L')-1],file=open('output.txt','a'))
