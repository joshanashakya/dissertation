import random


def quick_sort(array):
    if len(array) < 2:
        return array

    index = random.randint(1, len(array)) - 1
    pivot = array[index]
    smaller = [i for i in array[:index] + array[index + 1:] if i <= pivot]
    bigger = [i for i in array[:index] + array[index + 1:] if i > pivot]
    return quick_sort(smaller) + [pivot] + quick_sort(bigger)


if __name__ == "__main__":
    n = int(input())

    for _ in range(n):
        inp = int(input())
        numbers = [int(i) for i in input().split(' ')]
        numbers = quick_sort(numbers)

        i = 0
        while True:
            if i >= len(numbers) - 1:
                break

            if abs(numbers[i] - numbers[i + 1]) <= 1:
                if numbers[i] <= numbers[i + 1]:
                    numbers.pop(i)
                else:
                    numbers.pop(i + 1)
            else:
                i += 1

        if len(numbers) <= 1:
            print("YES")
        else:
            print("NO")
