import sysfrom os import pathif (path.exists('input.txt') and path.exists('output.txt')):    sys.stdout = open('output.txt', 'w')    sys.stdin = open('input.txt', 'r') def main():    s, t = input(), input()    n = len(s)    diff = 0    answer = []     for i in range(n):        if s[i] != t[i]:            answer.append(s[i] if diff % 2 == 0 else t[i])            diff += 1        else:            answer.append(s[i])        if diff % 2 == 0:        print("".join(answer))    else:        print("impossible") main()