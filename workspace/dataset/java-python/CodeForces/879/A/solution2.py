a=0for i in range(int(input())):  s,d=list(map(int,input().split()))  a += 1  while a<s or (a-s)%d!=0: a += 1print(a)
