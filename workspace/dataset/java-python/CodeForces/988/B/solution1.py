import sys,mathfrom collections import deque,defaultdictimport operator as opfrom functools import reducefrom itertools import permutations #sys.setrecursionlimit(10**4) #C:\Users\bittu\OneDrive\Documents\codeforcesI=sys.stdin.readline #alpha="abcdefghijklmnopqrstuvwxyz" """x_move=[-1,0,1,0,-1,1,1,-1]y_move=[0,1,0,-1,1,1,-1,-1]"""def ii():	return int(I().strip())def li():	return list(map(int,I().strip().split()))def mi():	return map(int,I().strip().split())  def ncr(n, r):    r = min(r, n-r)    numer = reduce(op.mul, range(n, n-r, -1), 1)    denom = reduce(op.mul, range(1, r+1), 1)    return numer // denom   def gcd(x, y):    while y:        x, y = y, x % y    return x def isPrime(n):	if n<=1:		return False	elif n<=2:		return True	else:				for i in range(2,int(n**.5)+1):			if n%i==0:				return False		return True #print("Case #"+str(_+1)+":",abs(cnt-k))    def main():	n=ii()	arr=[]	for i in range(n):		arr.append(I().strip()) 	arr = sorted(arr,key=lambda x: len(x)) 	if n==1:		print("YES")		print(*arr)	else:		flag=1		for i in range(1,n):			s=arr[i-1]			arr[i]						for j in range(len(arr[i])-len(arr[i-1])+1):				if arr[i][j:j+len(arr[i-1])]==arr[i-1]:										break			else:				flag=0				break		if flag:			print("YES")			for i in arr:				print(i)		else:			print("NO")    		   	 	 	 	    			 	     	        							     		 	 	 											 		    		          	      		 	   	        					     		      	 if __name__ == '__main__':	main()
