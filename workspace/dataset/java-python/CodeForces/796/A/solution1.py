n,m,k = [ int(x) for x in input().split()]m -= 1houses = [ int(x) for x in input().split()] will_buy = -1house_away = nfor i in range(n):    price = houses[i]    this_away = abs(i-m)    if ( price != 0 and k >= price and this_away <= house_away):        will_buy = i        house_away = this_away print(10*(abs(will_buy-m)))