from sys import stdinimport pprint input_string = list(map(int,stdin.readline().split())) n = input_string[0]m = input_string[1] i = 0 while (i*(i-1)) < m*2:     i += 1 # print(i) print(max(0, n - m*2), n - i)