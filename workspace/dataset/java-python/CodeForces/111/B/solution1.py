entrada = int(input())temporario = [-1] * 100005i=1while(i<=entrada):    resposta=0    x,y = input().split()  x = int(x)  y = int(y)     j = 1  while(j*j<=x):      if (x%j==0):          if (i-temporario[j]>y):        resposta += 1           if (x-j*j and i-temporario[int(x/j)]>y):         resposta += 1          temporario[j]=temporario[int(x/j)]=i    j += 1      print(resposta)  i += 1      				 		 			  		 		 	   			
