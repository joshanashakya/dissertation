n=int(input())a=int(input())b=int(input())c=int(input())n-=1if n==0:    print(0)else:    print(min(a,b,c)*(n-1)+min(a,b))
