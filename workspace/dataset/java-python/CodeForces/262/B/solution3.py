import sys  def ints_input():    return [int(i) for i in sys.stdin.readline().strip("\n").split(" ")]  def print_list(arr):    sys.stdout.writelines(str(x)+" " for x in arr)    sys.stdout.write("\n")  def fast_input(type=str):    return type(sys.stdin.readline().strip("\n"))  n, k = ints_input()arr = ints_input()# neg = [x for x in arr if x < 0]# if len(neg) == 0:#     print(sum(arr), min(arr))#     print(sum(arr)-min(arr))#     exit() ans = 0for i in range(n):    if arr[i] < 0 and k > 0:        arr[i] = -arr[i]        k -= 1    ans += arr[i] if k % 2 == 1:    print(ans - 2*min(arr))    exit()print(ans)
