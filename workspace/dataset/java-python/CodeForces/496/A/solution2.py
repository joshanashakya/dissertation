num = int(input())arr = list(map(int, input().split())) curr_score = float("-inf") for i in range(num-1):    curr_score = max(curr_score, arr[i+1]- arr[i]) new_score = float("inf") for i in range(num-2):    new_score = min(new_score, arr[i+2]-arr[i]) print(max(new_score, curr_score))