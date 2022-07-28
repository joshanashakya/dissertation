n = int(input())a = list(map(int,input().split())) cnt = 0while len(a)>0:	a = list(filter(lambda x: x%min(a)!=0, a))	cnt+=1print(cnt)
