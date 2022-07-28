n=int(input())i=2;ans=1while i*i<=n:  cnt=0  while n%i==0:   n=n//i   cnt+=1  if cnt:ans*=i  i+=1if n>1:ans*=nprint(ans)
