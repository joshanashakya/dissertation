n=int(input())a=len(str(n))b=0for i in range(1,a):    b+=i*(10**i-10**(i-1))b+=a*(n+1-10**(a-1))print(b)
