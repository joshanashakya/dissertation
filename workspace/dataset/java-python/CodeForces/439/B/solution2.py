n, x = map(int, input().split())li = list(map(int, input().split()))li.sort()t = 0for i in range(len(li)):    t+=li[i]*x    if x>1:        x-=1    elif x==0:        x = 1    elif x==1:        continueprint(t)
