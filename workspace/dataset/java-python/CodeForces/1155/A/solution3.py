# Files'''import syssys.stdin = open("input.txt", "r")sys.stdout = open("output.txt", "w")'''n = int(input())s = input()for i in range(1, n):    if s[i] < s[i - 1]:        print("YES")        print(i, i + 1)        exit(0)print("NO")