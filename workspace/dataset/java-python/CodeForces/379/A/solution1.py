a,b = map(int,input().split())cur,dead = a,0h = awhile cur>0:    dead += cur    cur = dead//b    dead = dead%b    h += cur print(h)
