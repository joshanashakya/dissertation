from sys import stdoutn = int(input())stdout.write("2\n")for lv in range(2, n + 1):    stdout.write(str(lv*(lv+1)*(lv+1)-(lv-1)) + '\n')
