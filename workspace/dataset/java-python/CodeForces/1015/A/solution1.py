n,m=input().split()n,m=int(n),int(m)arr,brr=[0]*(m+2),[0]*(m+2) #指定大小和初值的list for i in range(n):    l,r=input().split()    l,r=int(l),int(r)    arr[l]+=1;    arr[r+1]-=1;    # 数组[l,r]区间+1#若干次操作后数组的样子for i in range(1,m+2):    brr[i] = brr[i-1] + arr[i] # print(brr[1:m+1]) #[1, 2, 0, 0, 1]# print([i+1 for i,x in enumerate(brr[1:m+1]) if x==0]) #获取list特定元素值对应的下标 [3, 4] ans = [i+1 for i,x in enumerate(brr[1:m+1]) if x==0] print(len(ans)) for num in ans:    print(num,end=" ") 	  		 	 		  			 					  	  	 		