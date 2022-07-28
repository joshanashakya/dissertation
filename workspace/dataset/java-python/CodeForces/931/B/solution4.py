n,a,b=map(int,input().split()) a,b,r=a-1,b-1,0 while a!=b:  a//=2  b//=2  r+=1 print(r if 2**r<n else 'Final!')   # Made By Mostafa_Khaled
