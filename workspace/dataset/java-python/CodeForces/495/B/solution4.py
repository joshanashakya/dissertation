from math import sqrtn_to_mod, remainder = input().split() n_to_mod = int(n_to_mod)remainder = int(remainder)  def verify_n_divisors(array_div_population):    if array_div_population == []:        return 0    n_of_divisors = 1    for idx_div in range(len(array_div)):        n_of_divisors *= (array_div_population[idx_div] + 1)    return n_of_divisors  def is_at_array_div(divisor, array_div, array_div_population):    for div_idx in range(len(array_div)):        if divisor == array_div[div_idx]:            array_div_population[div_idx] += 1            return    array_div_population.append(1)    array_div.append(divisor)  def get_divisors(array_div, array_div_population):    divisors = [1]     for div_idx in range(len(array_div)):         divisors = multiply_fact_n_times(divisors, array_div[div_idx], array_div_population[div_idx])    return divisors  def multiply_fact_n_times(divisors, factor, n_times):    new_divisors = []    for div in divisors:        result = div * factor        new_divisors.append(result)    divisors = divisors + new_divisors     while n_times-1 > 0:        final_divisors = []        for div in new_divisors:            result = div * factor            final_divisors.append(result)        divisors = divisors + final_divisors        new_divisors = final_divisors        n_times -= 1     return divisors if n_to_mod == remainder:    print('infinity')elif n_to_mod <= remainder:    print(0)else:    array_div = []    array_div_population = []    factor_count = 2    plus_two = False     first_module = n_to_mod - remainder    max_size = sqrt(first_module)    count_modular_times = 0    module_controller = 2    while first_module != 1:        if first_module % factor_count == 0:            first_module //= factor_count            is_at_array_div(factor_count, array_div, array_div_population)         else:            if not plus_two:                factor_count += 1                plus_two = True            else:                factor_count += 2             if factor_count > max_size:                factor_count = first_module     divisors = list(sorted(get_divisors(array_div, array_div_population)))    for divisor in divisors:        if divisor > remainder:            count_modular_times += 1    print(count_modular_times)  	 				  	 	  	   								 			