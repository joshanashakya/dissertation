lucky=[]MAX=10000000000def func(s):	s=s*10	if s>MAX:		return	lucky.append(s+4)	lucky.append(s+7)	func(s+4)	func(s+7) func(0)lucky.sort() l,r=[int(x) for x in input().split(' ')] i=0j=0while(l>lucky[i]):	i+=1while(r>lucky[j]):	j+=1ans=0for x in range(i+1,j+1):	ans+=(lucky[x]-lucky[x-1])*lucky[x]ans-=(lucky[j]-r)*lucky[j]ans+=(lucky[i]-l+1)*lucky[i]print(ans)