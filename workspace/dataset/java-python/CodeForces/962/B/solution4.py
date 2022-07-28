n, a, b=map(int, input().split())s=a+bfor x in map(len, input().split('*')):	if a>b:a, b=b, a	a-=min(a, (x//2))	b-=min(b, (x-x//2))print(s-a-b);
