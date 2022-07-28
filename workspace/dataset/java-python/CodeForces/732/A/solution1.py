price, coin = map(int, input().split())i = 1while (price * i) % 10 != 0 and (price * i - coin) % 10 != 0:    i += 1print(i)
