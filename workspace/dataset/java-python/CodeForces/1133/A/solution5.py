a,b=input().split(':')x=60*int(a)+int(b)p=xa,b=input().split(':')x-=60*int(a)+int(b)x=abs(x)k=x//2p+=kprint("%02d:%0.2d"%(p//60,p%60))
