import sysfrom os import pathif (path.exists('input.txt') and path.exists('output.txt')):    sys.stdout = open('output.txt', 'w')    sys.stdin = open('input.txt', 'r') def main():    n = int(input())    clues = [[int(i) for i in input().split()] for i in range(n)]    dirs = [[int(i) for i in input().split()] for i in range(n)]    sum_x = 0    sum_y = 0    sum_a = 0    sum_b = 0    for i in range(n):        sum_x += clues[i][0]        sum_y += clues[i][1]        sum_a += dirs[i][0]        sum_b += dirs[i][1]        x = (sum_x + sum_a) // n    y = (sum_y + sum_b) // n    print(x, y)                main()
