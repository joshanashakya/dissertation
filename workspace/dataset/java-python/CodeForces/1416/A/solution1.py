def Work():    global n, arr, f, last, ans


n = int(input())
arr = [0] * (n + 1)
arr[1:] = list(map(int, input().split()))
f = [0] * (n + 1)
ans = [-1] * (n + 1)
last = [0] * (n + 1)     for i in range(1, n + 1):        f[arr[i]] = max(f[arr[i]], i - last[arr[i]])
last[arr[i]] = i     for x in range(1, n + 1):        f[x] = max(f[x], n - last[x] + 1)         i = f[x]
while i <= n and ans[i] == -1:            ans[i] = x
i += 1
for e in range(1, n + 1):        print(ans[e], end=" ")
print()     if __name__ == "__main__":    t = int(input())
for _ in range(
    t):        Work()  '''TC = O(n) // array consists of number from 1 to n only// Task -> for each i from 1 to k find number that occurs in all//          subarrays of size i//// for every i from 1 to n we calculate value of min value of such k// and say for a number i it value of k is f[k]// // for each i from 1 to n ://      x = arr[i]//      f[x] = max(f[x],i-last[x]) // in each iteration we are calciulating//                                 // value of f[arr[i]] and updating if i-last[arr[i]]//                                 // is greater than f[arr[i]]////// now for each x from 1 to n://      f[x] = max(f[x],n-last[x]+1) //boundary condition//      update ans[i] such that i>=f[x] and ans[i]!=-1////print ans'''
