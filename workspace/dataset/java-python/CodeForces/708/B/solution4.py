# submitting someone else's modified solution to understand how the various #python functions make this problem's source code come out to be so small #:O #!/usr/bin/env	python#-*-coding:utf-8 -*-import sys,matha00,a01,a10,a11=map(int,input().split())s=a00+a01+a10+a11if not s:	print('1')	sys.exit()s=a01+a10if a00:	z=a00<<1	x=math.ceil(math.sqrt(z))	if (x-1)*x!=z:		print('Impossible')		sys.exit()else:x=s and 1if a11:	z=a11<<1	y=math.ceil(math.sqrt(z))	if (y-1)*y!=z:		print('Impossible')		sys.exit()else:y=s and 1if x*y!=s:	print('Impossible')	sys.exit()if s:	i,j=divmod(a10,x)	print(i*'1',(x-j)*'0',sep='',end='')	if y>i:print('1',j*'0',(y-i-1)*'1',sep='')	else:print(j*'0')else:print(x*'0',y*'1',sep='')