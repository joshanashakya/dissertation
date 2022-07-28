for _ in range(int(input())):    arr_size, max_sum = map(int, input().split())     if arr_size == 1:        print(0)    elif arr_size == 2:        print(max_sum)    else:        print(2 * max_sum)
