n=int(input())a=list(map(int,input().split()))even=-float("Inf")odd=-float("Inf")for i in range(n):    if a[i]%2==0:        even=max([even+a[i],a[i],even])        odd=max([odd+a[i],odd])    if a[i]%2!=0:        odd,even=max([even+a[i],odd,a[i]]),max([odd+a[i],even])if odd%2==0:    print(0)else:    print(odd)        