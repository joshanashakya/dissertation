import mathn=int(input())l=list(map(int,input().split()))gc=l[0]for i in range(1,n):    gc=math.gcd(gc,l[i])print(gc if gc in l else "-1")
