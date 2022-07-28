slucky = [4, 7]
i = 0
while slucky[-1] < 10 ** 9:
    slucky.append(slucky[i] * 10 + 4)
    slucky.append(slucky[i] * 10 + 7)
    i += 1


def superlucky(n):
    four = 0
    seven = 0
    while n > 0:
        if n % 10 == 4:
            four += 1
        else:
            seven += 1
        n = n // 10
    if four == seven:
        return True
    return False


lucky = []
for item in slucky:
    if superlucky(item):
        lucky.append(item)
lucky = [0] + lucky + [4444477777]


def binarySearch(n):
    left = 0
    right = len(lucky) - 1
    mid = (left + right) // 2
    while left <= right:
        mid = (left + right) // 2
        if lucky[mid - 1] < n <= lucky[mid]:
            print(lucky[mid])
            break
        elif n > lucky[mid]:
            left = mid + 1
        else:
            right = mid - 1


n = int(input())
binarySearch(n)
