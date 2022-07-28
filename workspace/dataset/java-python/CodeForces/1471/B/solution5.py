def strange_list(arr, n, x):    S = 0

     minK = mk(arr[0], x)
minKInd = 0     for i in range(n):        k = mk(arr[i], x)
if k < minK:            minK = k
minKInd = i     for i in range(n):        qmk = minK + 1 if i < minKInd else minK
S += arr[i] * (qmk + 1)     return S 

def mk(q, x):    k = 0


while q % x == 0:        k += 1
q = q / x
return k if __name__ == "__main__":    t = int(input())
for i in range(t):        inps = input().split(" ")
n = int(inps[0])
x = int(inps[1])         arr = list(map(lambda x: int(x), input().split(" ")))         print("{0}".format(int(
    strange_list(arr, n,
                 x))))   # def strange_list(arr, n, x):#     S = 0#     stop = False #     for i in range(n):#         S += arr[i] #         xhat = 1#         qhat = arr[i] #         if not stop:#             while qhat % x == 0:#                 xhat = xhat * x#                 qhat = qhat / x#                 S += xhat * qhat#             stop = xhat == 1#     return S
