import mathn,x,y = map(int,input().split())num = input()num = num[n-x:]ans = 0mid = len(num)-y-1if num[mid] == '0':    ans+=1ans = ans + num[0:mid].count('1') + num[mid+1:].count('1')print(ans)
