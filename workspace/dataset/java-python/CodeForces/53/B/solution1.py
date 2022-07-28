import mathh, w = map(int, input().split())
if h / w >= 0.8 and h / w <= 1.25 and ((math.log(h, 2) % 1 == 0) or (math.log(w, 2) % 1 == 0)):
    print(h, w)else:
    w1 = 2 ** (math.log(w, 2) // 1)
h1 = min(h, (w1 * 1.25) // 1)
h2 = 2 ** (math.log(h, 2) // 1)
w2 = min(w, (h2 * 1.25) // 1)
if (h1 / w1 >= 0.8 and h1 / w1 <= 1.25) and (h2 / w2 >= 0.8 and h2 / w2 <= 1.25):        if
h1 >= h2 and h1 * w1 >= h2 * w2: print(int(h1), int(w1)) else:            print(int(h2), int(w2)) elif (
            h1 / w1 >= 0.8 and h1 / w1 <= 1.25): print(int(h1), int(w1)) else:        print(int(h2), int(w2))
