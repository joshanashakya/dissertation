I=inputP=printd={}for _ in'0'*int(I()):a,b=I().split();d[a]=max(d.get(a,0),int(b))v=d.values()n=len(d)P(n)for k in d:	a=b=0	for x in v:a+=x<=d[k];b+=x>d[k]	s='noob';a/=n;b/=n	if a>=.5and b>=.2:s='random'	if a>=.8and b>=.1:s='average'	if a>=.9and b>=.01:s='hardcore'	if a>=.99:s='pro'	P(k,s)