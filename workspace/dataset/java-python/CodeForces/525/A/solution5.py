n = int(input())KD = input() current_keys = {chr(ord('a') + key): 0 for key in range(26)}keysToBuy = 0 for i in range(n-1):    door = KD[i * 2 + 1]    key = KD[i * 2]    current_keys[key] += 1    req_key = door.lower()     if current_keys[req_key] > 0:        current_keys[req_key] -= 1    else:        keysToBuy += 1 print(keysToBuy) 		 		 		 				 	 	  	 					 	 	
