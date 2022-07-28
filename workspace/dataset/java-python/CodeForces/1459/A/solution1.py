t = int(input())
for _ in range(t):    n = int(input())
red_digits_str = input()
blue_digits_str = input()
greater_red_digit_count = 0
greater_blue_digit_count = 0
for digit_i in range(n):        r_digit = int(red_digits_str[digit_i])
b_digit = int(blue_digits_str[digit_i])
if r_digit > b_digit:
    greater_red_digit_count += 1        elif b_digit > r_digit:
    greater_blue_digit_count += 1
if greater_red_digit_count > greater_blue_digit_count:
    print('RED')    elif greater_blue_digit_count > greater_red_digit_count:
    print('BLUE')    else:
    print('EQUAL')
