k,d,t=map(int,input().split())d=((k+d-1)//d)*dn=2*t//(d+k)x=2*t%(d+k)if (x<=2*k):    ans=x/2+d*nelse:    ans=x-k+d*nprint(ans)
