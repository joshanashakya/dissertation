n,d,h = map(int,input().split())if d > h * 2: print(-1);exit()if n > 2 and h == 1 and d == 1: print(-1);exit()cnt = 0cur = 1 for i in range(1,h+1):    print(cur,cur + 1)    cur += 1    cnt += 1remain = d - hif remain: cur += 1;print(1,cur); remain -= 1; cnt += 1else:    cur += 1    while cnt + 1 < n:        print(2,cur)        cur += 1        cnt += 1if remain > 0:    while remain > 0:        print(cur, cur + 1)        cnt += 1        cur += 1        remain -= 1    cur += 1else:    cur += 1while cnt + 1 < n:    print(1,cur)    cur += 1    cnt += 1