n = int(input())s = input() x=0y=0prev_kingdom = Nonecoin = 0for step in s:    if step == 'U':        y += 1    else:        x += 1    if y > x:        curr_kingdom = 2    elif x > y:        curr_kingdom = 1    if prev_kingdom and curr_kingdom != prev_kingdom:        coin += 1    prev_kingdom = curr_kingdomprint(coin)
