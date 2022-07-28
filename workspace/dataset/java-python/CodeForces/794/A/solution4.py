a, b, c = [int(s) for s in input().split(' ')]n = int(input())notes = [int(s) for s in input().split(' ')]answer = len([note for note in notes if b < note < c])print(answer)
