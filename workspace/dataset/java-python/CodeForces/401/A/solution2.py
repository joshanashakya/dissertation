import math  def main_function():    n, x = [int(i) for i in input().split(" ")]    cards = [int(i) for i in input().split(" ")]    sum_negative = 0    sum_positive = 0    for i in cards:        if i > 0:            sum_positive += i        else:            sum_negative += abs(i)    dif = abs(sum_negative - sum_positive)    cards = int(math.ceil(dif / x))    return cards      print(main_function())