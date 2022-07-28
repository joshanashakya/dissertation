inp = input()nums = [int(i) for i in inp.split()]temp = sum(nums)if temp == 0:    print('-1')elif temp % len(nums) == 0:    print(int(temp/len(nums)))else:    print('-1')   
