input()nums = map(int, str(input()).split(' '))print(' '.join(map(str, map(lambda x: x if x % 2 == 1 else x - 1, nums))))
