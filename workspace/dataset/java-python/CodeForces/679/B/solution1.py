import math def steps(m, dct):    if m <= 7:        return m    if dct.get(m):        return dct[m]    x = math.floor(m**(1/3))    dct[m] = 1 + steps(max(m - x**3, (x**3 - 1) - (x - 1)**3), dct)    return dct[m] if __name__ == "__main__":    m = int(input())    total_blocks_used = 0    total_vol = 0    steps_dct = {}    while (m > 0):        x = math.floor(m ** (1/3))        if steps(m, steps_dct) == 1 + steps(m - x**3, steps_dct):            m -= x**3            total_vol += x**3        else:            m = x**3 - 1 - (x-1)**3            total_vol += (x-1)**3        total_blocks_used += 1    print(f"{total_blocks_used} {total_vol}")