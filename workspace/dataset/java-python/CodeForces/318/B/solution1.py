import sys text = sys.stdin.readline().strip() i = 0heavys = 0result = 0while (i + 5) <= len(text):    if text[i:i+5] == "heavy":        heavys +=1        i += 5    elif text[i:i+5] == "metal":        result += heavys        i += 5    else:        i += 1print(result)    		 		   	 			 	 		  	      	
