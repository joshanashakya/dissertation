n,v=map(int,input().split())amt=0if n>v:  amt=v  for i in range(2,n-v+1):    amt+=ielse:  amt = n-1print(amt)
