if __name__ == '__main__':
    s = input()
    d = dict()
    for i in range(0, 10):
        a = input()
        d[a] = i
    i = 0
    ans = ''
    while i < 80:
        ans = ans + str(d[s[i:i + 10]])
        i = i + 10
    print(ans)
