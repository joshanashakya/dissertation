n = int(input())A = list(map(int, input().split(' ')))s = sum(A) if s%2==0:	s = s//2else:	s = s//2 + 1 c = 0ans = 1for i in A:	c+=i	if c>=s:		break	ans+=1print(ans)
