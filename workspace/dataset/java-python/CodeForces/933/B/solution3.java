p,k=map(int,raw_input().split())r=[]while p:	r.append(p%k)	p/=k	p*=-1print len(r)print ' '.join(map(str,r))
