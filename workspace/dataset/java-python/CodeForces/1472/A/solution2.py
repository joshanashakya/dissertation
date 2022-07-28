for j in range(int(input())):    count = 1
list1 = list(map(int, input().split()))
list2 = list1.copy()
temp = 0
while list1[0] % 2 == 0:        list1[0] = list1[0] // 2
temp += 1
if temp:        count *= 2 ** temp
temp = 0
while list1[1] % 2 == 0:        list1[1] = list1[1] // 2
temp += 1
if temp:        count *= 2 ** temp
if count >= list1[2]:
    print("YES")    else:
    print("NO")
