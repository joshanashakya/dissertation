sticks = [2, 7, 2, 3, 3, 4, 2, 5, 1, 2]x = input()a = 1for i in x:    a *= sticks[ord(i) - ord('0')]print(a)
