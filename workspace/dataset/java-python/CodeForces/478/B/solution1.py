n,m = map(int,input().split())f = n//mq = n%m mini = (f*(f-1))//(1+1)mini*=mmini += f*q    ma = n-mma = (ma*(ma+1))//(1+1)print(mini,ma)
