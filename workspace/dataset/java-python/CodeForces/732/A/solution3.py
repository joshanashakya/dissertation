[shovel_price, rest] = input().split(' ')x = 1while True :    if ((x * int(shovel_price)) % 10 == 0) or ((x*int(shovel_price) % 10 == int(rest))) :        print(x)        exit()    else :        x += 1
