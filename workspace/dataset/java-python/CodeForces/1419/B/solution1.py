arr = [1]
for j in range(1, 30):    arr.append(arr[-1] + 2 ** j)
new_arr = []
for j in arr:    new_arr.append((j * (j + 1)) // 2)
for j in range(1, len(arr)):    new_arr[j] += new_arr[j - 1] import bisectt = int(input())
for i in range(t):    n = int(input())
x = bisect.bisect(new_arr, n)
print(x) 
