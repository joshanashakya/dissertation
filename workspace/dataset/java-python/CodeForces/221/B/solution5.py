from math import sqrt  def check(n, d):    n = str(n)    d = str(d)    for c in d:        if c in n:            return True    return False  def get_divisors(n):    m = int(sqrt(n)) + 1    divisors = set()    for d in range(1, m):        if n % d == 0:            divisors.add(d)            divisors.add(n // d)    return list(divisors)  def main():    n = int(input())    divs = get_divisors(n)    c = 0    for d in divs:        if check(n, d):            c += 1    print(c) if __name__ == "__main__":    main()
