n,m=list(map(int,input().split()))petaya=0 #Matchvasaya=0 #not Matchpetaya+=min(n,m)-1vasaya+=min(n,m)	petaya+=max(m,n)-min(n,m)  print(petaya,vasaya)
