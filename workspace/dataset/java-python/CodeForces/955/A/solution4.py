hh, mm = map(int, input().split())H, D, cost, nutr = map(int, input().split()) hh = 60 * hh + mmif hh >= 1200:    print('{:.4f}'.format((H + nutr - 1) // nutr * cost * 0.8))else:    print('{:.4f}'.format(min((H + nutr - 1) // nutr * cost, (H + (1200 - hh) * D + nutr - 1) // nutr * cost * 0.8)))