n = int(input())lst = list(map(int , input().split()))ans = []lst = lst[::-1]for i in lst:	if i not in ans:		ans.append(i)ans = ans[::-1]print(len(ans))for i in ans:	print(i, end = " ")
