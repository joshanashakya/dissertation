import math if __name__ == '__main__':    m, n = [int(item) for item in input().split()]    res = 0    for i in range(1, m +1):        current = i* ( math.pow((i/m), n) - math.pow(((i - 1)/ m), n))        res += current    print(res)  				 							 			  	 	   		 			