t=int(input())arr=list(map(int,input().split()))# arr.sort()new=[]s1=1s2=0for i in arr:	x=arr.count(i)	new.append(x)arr=set(arr)print(max(new),len(arr)) 
