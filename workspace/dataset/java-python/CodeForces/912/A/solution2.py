yellow,blue = map(int,input().split())x,y,z = map(int,input().split())ry = x*2+yrb =z*3+yr1,r2 = 0,0if ry-yellow < 0:    r1 = 0else:    r1 = ry-yellowif rb - blue < 0:    r2 = 0else:    r2 = rb-blueprint(r1+r2)