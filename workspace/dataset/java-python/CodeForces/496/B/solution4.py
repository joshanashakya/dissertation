n = int(input())a = list(input())ans = afor i in range(10):  for j in range(n):    if a < ans:      ans = a    a = a[1:]+[a[0]]  for j in range(n):    a[j] = str((int(a[j])+1)%10)print("".join(ans))
