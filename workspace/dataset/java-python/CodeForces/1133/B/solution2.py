def maxPairs(nums, k):    m = {}     result = 0     for i in nums:        if ((i in m) and m[i] > 0):                    m[i] = m[i] - 1            result += 1         else:            if k - i in m:                m[k - i] += 1            else:                m[k - i] = 1    return result  def solve():    n,k = map(int, input().split())    d= list(map(lambda x: int(x)%k, input().split()))        return (d.count(0)//2 + maxPairs(d, k))*2    print(solve())
