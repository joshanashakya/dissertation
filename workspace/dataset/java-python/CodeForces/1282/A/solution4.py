import sys  t = int(input()) for _ in range(t):     """    Cita código externo:    https://www.geeksforgeeks.org/python-input-methods-competitive-programming/    """     a, b, c, d = list(map(int, sys.stdin.readline().strip().split()))     if a > b:        ma = a        mi = b    else:        ma = b        mi = a     l = ma - mi     if c + d <= mi or c - d >= ma:        pass    elif c - d <= mi and c + d >= ma:        l = 0    elif mi <= c and c <= ma:        l -= min(c - mi, d)        l -= min(ma - c, d)    elif c < mi:        l -= ((c + d) - mi)    elif c > ma:        l -= (ma - (c - d))    print(l) 	 	  		 			 					 		  	
