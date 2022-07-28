n = int(input())arr = [int(num) for num in input().split()] arr = sorted(arr) x = arr[0] ans = 0 for num in arr:    ans+=num-x    x = num+1print(ans)		 		  			    	 	 	 	 				 		
