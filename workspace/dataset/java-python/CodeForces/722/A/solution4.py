c = input()h, m = list(map(int, input().split(':')))if m >= 60:	m %= 10if c == '12' and h == 0:	h = 1elif c == '12' and h > 12:	if h % 10:		h %= 10	else:		h = 10elif c == '24' and h > 23:	h %= 10print('%02d:%02d' % (h,m))	 		  		   	        		 		 		  	
