"""Author: Juan Jo Oliveras aka IOWizard Reasoning:(1) Each element q[i] can be repeatedly divided by x  k times until it reaches a non divisible number by x (2) Each division adds x' elements of |q'/x| which always add to q. So we say that sum of k-division productions S[k](q,x) = q(3) Also if we sum of k-division productions from 0 to max k for element q[i] we get the accumulated sum AS[k](q,x) = q (k + 1) because we repeatedly sum k instances of q = S[k'](q,x) (4) Let's compute al max k's for each q[i] and call them mk[i] (5) There will be a point in the array when we can't further divide because of the problem constraint, we will call it cons_i(6) That point will always occur on a division of the first element with lowest mk[i] because every mk[i] decays at the same constant rate, and the lowest mk[i] will reach first the constraint point.(7) Every new generated element before the constraint point will be respected for last, so we express mk[i] = mk[cons_i] + 1 for all i < cons_i(8) Every possible generated element after constraint point will be vanished and not added to the list so we get mk[i] = mk[cons_i] for all i >= cons_i (9) This actions gives us our new mk[i]'s which we can use with formula AS of (3)(10) Summing up all accumulated sums of divisions AS[i] will give us the total sum of the array after its valid productions.""" 

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
x = int(inps[1])         arr = list(map(lambda x: int(x), input().split(" ")))         print(
    "{0}".format(int(strange_list(arr, n, x))))
