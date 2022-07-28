n = int(input()) mt = 0mq = 0 t = 0q = 0 for i in range(n):    (ti, ci) = map(int, input().split())    q = max(0, q-ti+t)    t = ti    q += ci    mq = max(mq, q)    mt = t+q print(mt, mq)
