t = int(input())for i in range(t):    a,b,c,d = map(int, input().split())    if a <= b:        print(b)    elif d >= c:        print(-1)    else:        a -= b        hasil = b + ((a + c-d -1)//(c-d)*c)        print(hasil)	 	  		     			 		 	 	 	  		 		