import mathu, v, x, y = map(int, input().split())z = x * y // math.gcd(x, y)def check(ans):    inter = ans - ans // x - ans // y + ans // z    fx = ans // y - ans // z    fy = ans // x - ans // z    if fx + inter < u:        return False    if fy + inter < v:        return False    if fx + fy + inter < u + v:        return False    return Trueans = 0for i in range(31, -1, -1):    if not check(ans + 2 ** i):        ans += 2 ** iprint(ans + 1)				 	 			   	   				    	 		 	
