import sysfrom os import pathif (path.exists('input.txt') and path.exists('output.txt')):    sys.stdout = open('output.txt', 'w')    sys.stdin = open('input.txt', 'r') # list comprehension - l = [s[start:start + 3] for start in range(0, len(s), 3)] def main():    T = int(input())    for ii in range(T):        n, x = (int(i) for i in input().split())        l = [int(i) for i in input().split()]        curr = 1        while x > 0:            if curr not in l:                x -= 1            curr += 1         while True:            if curr in l:                curr += 1            else:                curr -= 1                break                    print(curr)     main()