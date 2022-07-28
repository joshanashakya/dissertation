I = input
for _ in [0] * int(I()): x, y = map(int, I().split());f = I().count;print('YNEOS'[f('UD'[y < 0]) < abs(y) or
                                                                                  f('RL'[x < 0]) < abs(x)::2])
