#Greedydef Funcion(arreglo,n,m,k):    suma = 0    separaciones = []        for i in range(len(arreglo)-1):        separaciones.append((arreglo[i+1]-arreglo[i]))            separaciones_s = sorted(separaciones)     for i in range(n - k):        diff = separaciones_s[i]        suma = suma + diff     return suma + k  n, m, k = list(map(int,input().split()))arreglo = list(map(int,input().split())) print(Funcion(arreglo,n,m,k))				  	  	 	     	       	 		
