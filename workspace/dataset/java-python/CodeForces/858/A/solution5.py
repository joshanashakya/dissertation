from math import gcd  def lcm(a, b):    return (a / gcd(a, b)) * b  num = "1" n, k = map(int, input().split())for i in range(k):    num += "0"num = int(num)print(int(lcm(num, n)))
