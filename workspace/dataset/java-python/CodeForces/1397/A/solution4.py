t = int(input())
for i in range(t):
    d = {}
    n = int(input())
    for j in range(n):
        s = input()

        for letter in s:
            if letter in d:
                d[letter] += 1
            else:
                d[letter] = 1

    all_count = True

    for k in d.values():
        if k % n != 0:
            all_count = False

    if not all_count:
        print("no")
    else:
        print("yes")
