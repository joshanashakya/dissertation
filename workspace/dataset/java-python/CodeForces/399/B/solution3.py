length, string = int(input()), input()print(sum([2 ** i if string[i] == "B" else 0 for i in range(len(string))]))
