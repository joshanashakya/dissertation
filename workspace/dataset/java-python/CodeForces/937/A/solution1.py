def main_function():    n = int(input())    p = [int(i) for i in input().split(" ")]    hash = [0 for i in range(605)]    for i in p:        if not i == 0:            hash[i] += 1    count = 0    for i in hash:        if i != 0:            count += 1    return count   print(main_function())
