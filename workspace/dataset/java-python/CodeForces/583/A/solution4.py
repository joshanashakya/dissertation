if __name__ == '__main__':    n = int(input())    nums = [[0] * n for i in range(n)]     ans = list()    for x in range(n ** 2):        i, j = map(int, input().split())        if nums[i-1][j-1] == 0:            for a in range(1, n + 1):                nums[i-1][a-1] += 1            for a in range(1, n + 1):                nums[a-1][j-1] += 1            ans.append(str(x + 1))    print(' '.join(ans))  				  		 				  	 	 	  	 				 	