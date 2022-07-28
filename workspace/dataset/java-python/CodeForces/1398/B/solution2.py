testcases = int(input())

for i in range(testcases):
    sequence = input()
    sequence = sequence.split('0')
    sequence = [len(item) for item in sequence if len(item) > 0]
    sequence.sort(reverse=True)
    print(sum(sequence[::2]))
