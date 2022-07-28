buy,sell,money=map(int,input().split())minPrice=min(list(map(int,input().split())))maxPrice=max(list(map(int,input().split())))print(max(money,(money//minPrice)*maxPrice+money%minPrice))
