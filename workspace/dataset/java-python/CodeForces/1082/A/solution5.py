#Tristan Hull numOfCases = int(input())tests = [] for case in range(numOfCases):    tests.append(list(map(int, input().split()))) for case in range(numOfCases):    n = tests[case][0]    x = tests[case][1]    y = tests[case][2]    d = tests[case][3]     step = float('inf')    if x == y: step = 0    else:        if abs((y-x)) % d == 0:            step = min(step, abs(y-x)/d)        if (y-1) % d == 0:            temp = 0            if not (x % d == 0):                temp = 1            temp = x / d + (y-1) / d + temp;            step = min(step, temp)        if ((n-y) % d == 0):            temp = 0            if not ((n-x) % d == 0):                temp = 1            temp = (n-x) / d + (n-y) / d + temp            step = min(step, temp)        if step == float('inf'): step = -1        print(int(step))	    	 		 	 				     	 		 	   	