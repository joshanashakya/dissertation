n, k = [int(i) for i in input().split()]scores = [int(i) for i in input().split()]advance = [score for score in scores if score >= scores[k-1] and score > 0]print(len(advance))
