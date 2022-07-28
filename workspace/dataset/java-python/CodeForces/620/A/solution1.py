print(max(abs(a-b)for a,b in zip(*[map(int,input().split())for _ in(1,2)])))
