if __name__ == '__main__':	n=int(input())	arr=[[0,0]]	for i in range(n):		arr.append(list(map(int,input().split())))	#d_link=[[0,0]]	end=0	for i in range(1,n+1):		if not arr[i][0]:			arr[end][1]=i			arr[i][0]=end			j=i			while arr[j][1]:				j=arr[j][1]			end=j 	for i in range(1,n+1):		print(*arr[i])