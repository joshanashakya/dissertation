def nik(rud,ans):    for i in range(1,n):        if rud[i]<2*rud[i-1] and rud[i]!=rud[i-1]:            ans="YES"            break    print(ans)    n=int(input())rud = list(map(int,input().split()))rud.sort()ans="NO"nik(rud,ans)