for t in range(int(input())):    x = input()[::-1]    y = input()[::-1]    posy = 0    while y[posy] != "1":        posy += 1    posx = posy    while x[posx] != "1":        posx += 1    ans = posx - posy    print(ans)        