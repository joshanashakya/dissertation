import mathd, h, v, e = tuple([int(num) for num in input().split()])# ml_per_second_from_rain = math.pi * (d/2.0) ** 2 * ecm_per_second_from_drinking = v / math.pi / (d/2.0) ** 2if(e >= cm_per_second_from_drinking):	print('NO')else:	print('YES')	print('%.12f'%(h / (cm_per_second_from_drinking - e)))
