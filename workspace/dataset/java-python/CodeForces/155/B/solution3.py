n = int(input().strip())cards = []for i in range(n):    a, b = [int(ele) for ele in input().strip().split()]    tup = (b, a)    cards.append(tup) ctr = 1maxpoints = 0cards = sorted(cards, reverse = True)for i, tup in enumerate(cards):    if ctr > 0:        # play card        maxpoints += tup[1]        ctr += tup[0] - 1 print(maxpoints)
