cache = {}  def countOnes(number):    counter = 0    while number != 0:        counter += 1        number = number & (number - 1)    return counter  def populateCache(string, aLen):    ones = 0    zeroes = 0    index = len(string) - aLen + 1    for i in range(len(string) - 1, -1, -1):        if string[i] == "1":            ones += 1        else:            zeroes += 1        cache[i] = (ones, zeroes)    for i in range(0, aLen - 1, 1):        ones, zeroes = cache[i]        cache[i] = (ones - cache[index][0], zeroes - cache[index][1])        index += 1  def matchingStrings(a, b):    return countOnes(int(a, 2) ^ int(b, 2))  total = 0a = str(input())aLen = len(a)b = str(input())bLen = len(b)if aLen == bLen:    print(matchingStrings(a, b))else:    populateCache(b, aLen)    for index, ele in enumerate(a):        num = int(ele)        if num == 0:            total += cache[index][0]        else:            total += cache[index][1]    print(total)