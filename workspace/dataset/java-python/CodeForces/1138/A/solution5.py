n_pieces = int(input())sushi_array = map(int, input().split()) previous_len = 1curr_len = 1previous_piece = 0max_sushi = 0 for piece in sushi_array:    if previous_piece != piece:                max_sushi = max(max_sushi, 2*min(previous_len, curr_len))        previous_len = curr_len        curr_len = 1        previous_piece = piece     else:        curr_len += 1        max_sushi = max(max_sushi, 2*min(previous_len, curr_len)) print(max_sushi) 