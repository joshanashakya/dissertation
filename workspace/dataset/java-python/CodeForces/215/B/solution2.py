x = [int(a) for a in input().split()]y = [int(a) for a in input().split()]z = [int(a) for a in input().split()]x.pop(0)y.pop(0)z.pop(0)x.sort()y.sort()z.sort()A, B = [int(a) for a in input().split()]temp = x[-1]/(( 1 + ( A*z[0]/(B*y[-1]) ) )**0.5)temp = round(temp, 12)if temp-int(temp)>0.999999:temp = int(temp) + 1print(temp)
