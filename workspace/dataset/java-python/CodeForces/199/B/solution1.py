x1, y1, r1, R1 = map(int, input().split())x2, y2, r2, R2 = map(int, input().split()) D = (x1-x2)**2+(y1-y2)**2c = 0c += ((r1-r2)**2>=D)c += ((R1-R2)**2>=D)c += ((R1+r2)**2<=D)c += ((R2+r1)**2<=D)c += ((R1+R2)**2<=D)*2if r1 >= R2:    c += ((r1-R2)**2>=D)*2if r2 >= R1:    c += ((r2-R1)**2>=D)*2print(c)