n, m = map(int, input().split())arr = list(map(int, input().split()))ans = 0temp = mfor i in range(len(arr)):	if temp >= arr[i]:		temp-=arr[i]	else:		ans += 1		temp = m		temp -= arr[i]print(ans+1)
