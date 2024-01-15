def solution(num_list):
    a = num_list[-1]
    b = num_list[-2]
    num_list.append(a-b if a > b else a*2)
    
    answer = num_list
    return answer