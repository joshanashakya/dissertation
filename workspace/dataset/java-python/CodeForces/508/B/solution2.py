def n_to_list(n):    lst = []    while n > 0:        lst.append(n % 10)        n //= 10    lst.reverse()    return lst  def answer(lst): #list of ints as chars    #lst = n_to_list(n) #list of 1-digit ints.    last_digit = int(lst[-1])    recent_even_index = 10**10    #print('lst=', lst)    for i in range(len(lst)):        if int(lst[i]) % 2 == 0:            recent_even_index = i            if int(lst[i]) < last_digit:                lst[i], lst[-1] = lst[-1], lst[i] #swap.                return ''.join(lst)    #print('rei=', recent_even_index)    if recent_even_index == 10**10: #no even number found        return -1    #even index found, but all smaller than last digit. Limit damage.    lst[recent_even_index], lst[-1] = lst[-1], lst[recent_even_index]     return ''.join(lst) def main():    n = list(input())    print(answer(n))      returnmain()