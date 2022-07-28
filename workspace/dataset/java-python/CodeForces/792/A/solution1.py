def main():	n=int(input())	a=list(map(int,input().split()))	a.sort()	c=[]	for i in range(n-1):		c+=[a[i+1]-a[i]]	print(min(c),c.count(min(c))) if __name__=='__main__':	main()
