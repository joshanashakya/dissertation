numbers = list(map(int, input().split()))max_ = max(numbers)output = [] for num in numbers:    if num != max_:        print(max_-num,end=" ")
