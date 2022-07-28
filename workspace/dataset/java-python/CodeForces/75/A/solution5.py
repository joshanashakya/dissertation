a = input()
b = input() ansa = int(str(int(a) + int(b)).replace('0', '')) if (
        int(a.replace('0', '')) + int(b.replace('0', '')) == ansa):
    print('YES')else:
    print('NO')
