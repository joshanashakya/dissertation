import sys input = sys.stdin.readline def main():	n = int(input()) 	ans = 0	for i in range(1,n+1):		ans+=1/n		n-=1 	print(ans) main()
