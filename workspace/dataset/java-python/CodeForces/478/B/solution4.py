n, m = map(int, input().split())kmin = n // mkmax = n - mpairMin = m * kmin * (kmin - 1) // 2 + kmin * (n % m)pairMax = (kmax + 1) * kmax // 2print(pairMin, pairMax)	 	  				   	    	  	    	  	 	
