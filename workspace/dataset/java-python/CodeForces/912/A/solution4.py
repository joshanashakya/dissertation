A,B = map(int, input().split())x,y,z = map(int, input().split())A1 = 2*x + y - AB1 = 3*z + y - Bfinal = 0if A1 > 0:    final = final + A1if B1 > 0:    final = final + B1print(final)
