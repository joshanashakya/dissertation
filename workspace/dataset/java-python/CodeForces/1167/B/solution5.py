from itertools import permutationsprint('? 1 2')print('? 2 3')print('? 3 4')print('? 4 5')ab = int(input())bc = int(input())cd = int(input())de = int(input()) s = [4, 8, 15, 16, 23, 42]for l in permutations(s):    if l[0]*l[1]==ab and l[1]*l[2]==bc and l[2]*l[3]==cd and l[3]*l[4]==de:        print(f'! {l[0]} {l[1]} {l[2]} {l[3]} {l[4]} {l[5]}')
