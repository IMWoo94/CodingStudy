def solution(num_list):
    answer = sum(num_list) if len(num_list) > 10 else eval("*".join(map(str,num_list)))
    return answer