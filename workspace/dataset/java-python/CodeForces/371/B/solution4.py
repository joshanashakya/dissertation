#dividing by 2 and 3 and 5 maeans subtracrting the powersfrom math import gcda,b=map(int,input().split())c=gcd(a,b);a=a//c;b=b//c;ans=0for i in [2,3,5]:  x=0;y=0  while a%i==0:x+=1;a=a//i  while b%i==0:y+=1;b=b//i  ans+=abs(x-y)if a!=b:print(-1)else:print(ans)