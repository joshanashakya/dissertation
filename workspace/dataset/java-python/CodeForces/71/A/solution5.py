for _ in range(int(input())):    line = input()
length = len(line)
print((line[0] + str(length - 2) + line[-1]) if length > 10 else line)
