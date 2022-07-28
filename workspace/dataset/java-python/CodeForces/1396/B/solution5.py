def stoned(arr):
    s = sum(arr)
    if max(arr) > s // 2: return "T"
    if s % 2 == 0:
        return "HL"
    else:
        return "T"


for i in range(int(input())):
    a = input()
    lst = list(map(int, input().strip().split()))
    print(stoned(lst))
