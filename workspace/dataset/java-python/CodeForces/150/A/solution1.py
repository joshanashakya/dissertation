q=int(input())if q==1:    print(1)    print(0)else:    ls=[]    for i in range(2,int(q**0.5)+1):        while q%i==0:            ls.append(i)            q=q//i    if q>1:        ls.append(q)    if len(ls)>2:        print(1)        print(ls[0]*ls[1])    elif len(ls)==2:        print(2)    else:        print(1)        print(0) 	  	  	 			 			 	   				   		
