def main_function():    n = int(input())    a = [int(i) for i in input().split(" ")]    sum_positive = 0    sum_negative = 0    for i in a:        if i > 0:            sum_positive += i        else:            sum_negative += i    return sum_positive - sum_negative        print(main_function())