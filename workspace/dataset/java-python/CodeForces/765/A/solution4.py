n = int(input())t = nhome = input()departure = []while t>0:    flight = input()    departure.append(flight[:3])    t-=1 if n%2 == 0:    print('home')else:    print('contest')
