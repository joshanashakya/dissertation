vp = int(input())vd = int(input())t = int(input())f = int(input())c = int(input()) pp = t * vpbijoux = 0pd  = 0while (pp < c):	if vp >= vd:		break	pp = (vd * pp) / (vd - vp)	if pp >= c:		break	bijoux +=1	pp += (pp/vd + f) * vpprint(bijoux)		