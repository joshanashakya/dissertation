word = input('')
upper = 0l
ower = 0
for x in word:    if
x >= "A" and x <= "Z": upper += 1 elif x >= "a" and x <= "z": lower += 1
if lower >= upper:
    print(word.lower())else:
    print(word.upper())
