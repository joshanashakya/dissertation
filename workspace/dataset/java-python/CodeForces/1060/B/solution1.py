n = int(input())  def sum_of_digits(numer):    numer = str(numer)    summ = 0    for digit in numer:        summ += int(digit)    return summ  if n < 10:    print(n)else:    len_num = len(str(n)) - 1    num_1 = int(len_num * "9")    num_2 = n - num_1    #print(f"num 1: {num_1}\nnum 2: {num_2}")    result = len_num * 9 + sum_of_digits(num_2)    print(result)