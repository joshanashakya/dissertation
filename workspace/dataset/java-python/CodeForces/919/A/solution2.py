import math def main_function():    output_list = []    n, m = [int(i) for i in input().split(" ")]    for i in range(n):        a, b = [int(i) for i in input().split(" ")]        output_list.append((a/b) * m)    return min(output_list)       print(main_function())
