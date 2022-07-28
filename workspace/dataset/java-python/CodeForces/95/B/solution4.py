from sys import stdin, stdout

from collections import deque

MOD = 10 ** 9 + 7

INF = float('inf')

sze = 10 ** 4 + 1

EPS = 10 ** -6

s = stdin.readline().strip()

challenger = []

for i in range(len(s)):

    if s[i] in '47':

        challenger.append(s[i])

    elif s[i] in '89':

        update = []

        for j in range(1, len(challenger) + 1):

            if challenger[-j] == '4':

                update += ['7'] + challenger[:-j][::-1]

                break

            else:

                update.append('4')

        else:

            update.append('4')

        challenger = update[::-1] + ['4' for j in range(len(s[i:]))]

        break

    elif s[i] < '4':

        challenger += ['4' for j in range(len(s[i:]))]

        break

    else:

        challenger += ['7'] + ['4' for j in range(len(s[i:]) - 1)]

        break

while True:

    if challenger.count('4') == challenger.count('7'):
        break

    if len(challenger) % 2:

        challenger = ['4' for i in range((len(challenger) + 1) // 2)] + ['7' for i in range((len(challenger) + 1) // 2)]

    elif challenger.count('4') > challenger.count('7'):

        cnt = challenger.count('4') - challenger.count('7')

        for i in range(len(challenger) - 1, -1, -1):

            if challenger[i] == '4':  # 1

                challenger[i] = '7'

                cnt -= 2

            if not cnt:
                break

    else:

        cnt = [0 for i in range(len(challenger))]

        cnt[-1] = challenger[-1] == '7'

        for i in range(2, len(challenger) + 1):
            cnt[-i] = cnt[-i + 1] + (challenger[-i] == '7')

        if not challenger[:len(challenger) // 2].count('4'):

            challenger = ['4' for i in range((len(challenger) + 2) // 2)] + ['7' for i in
                                                                             range((len(challenger) + 2) // 2)]

        else:

            first, second = challenger.count('4'), challenger.count('7')

            for j in range(len(challenger) - 2, -1, -1):

                if challenger[j] == '4' and cnt[j + 1] * 2 + first >= second:

                    challenger[j] = '7'

                    for z in range(j + 1, len(challenger)):
                        challenger[z] = '4'

                    break

stdout.write(''.join(challenger))

# Made By Mostafa_Khaled
