# coding: utf-8 alphabet = 'abcdefghijklmnopqrstuvwxyz' for ct in range(int(input())):  s = input()    print('Yes') if ''.join(map(str, sorted(s))) in alphabet else print('No')
