def digitsof(n):    lst = []    while n > 0:        lst.append(n % 10)        n //= 10        return lst  def answer(n):    #given n, how many digits to be written?    # n = # 100s + # 10s + # 1s, etc.    lst = digitsof(n) #in reverse order    cnt = 0    for i in range(len(lst)):        cnt += lst[i] * (i+1)*(10**i) - ((10**i) - 1)             return def answer(n):    lst = digitsof(n) # in reverse order.    cnt = 0    if n >= 9:        cnt += 9    if n >= 99:        cnt += 90 * 2    if n >= 999:        cnt += 900 * 3    if n >= 9999:        cnt += 9000 * 4    if n >= 99999:        cnt += 90000 * 5    if n >= 999999:        cnt += 900000 * 6    if n >= 9999999:        cnt += 9000000 * 7    if n >= 99999999:        cnt += 90000000 * 8    if n >= 999999999:        cnt += 900000000 * 9    if n >= 9999999999:        cnt += 9000000000 * 10    if min(lst) < 9:        cnt += (n - 10**(len(lst)-1) + 1) * len(lst)            return cnt  def main():    n = int(input())    print(answer(n))      returnmain()
