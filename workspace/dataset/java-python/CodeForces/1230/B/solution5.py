def tostring(s):    str1 = ''    return str1.join(s) vet = input().split()s = list(input())n = int(vet[0])k = int(vet[1]) if(n==1 and k):    print(0) else:    if(s[0] > '1' and k):        s[0] = '1'        k-=1    for i in range(1, len(s)):        if(s[i] > '0' and k>0):            s[i]= '0'            k-=1    print(tostring(s))	 		 					 	  	  			      	 	